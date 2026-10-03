package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.utils.RxUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BEROctetStringParser;
import o.decodeDimensions;
import o.getSizeInBytes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BEROctetStringParser {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static final Map<String, BEROctetStringParser> onWarmupCompleted = new LinkedHashMap();
    private final boolean onExtraCallback;
    private final onDisclaimerClick onExtraCallbackWithResult;
    private final drawProgress<decodeDimensions> onNavigationEvent;

    public BEROctetStringParser(@NotNull onDisclaimerClick ondisclaimerclick) throws Throwable {
        Intrinsics.checkNotNullParameter(ondisclaimerclick, "");
        this.onExtraCallbackWithResult = ondisclaimerclick;
        IAuthTabCallback();
        this.onNavigationEvent = new drawProgress<>(new decodeDimensions(null, null, 0L, null, null, null, 63, null));
    }

    public final drawProgress<decodeDimensions> onExtraCallback() {
        return this.onNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void IAuthTabCallback() throws Throwable {
        writeRaw<decodeDimensions> writerawOnExtraCallbackWithResult = onExtraCallbackWithResult();
        final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.savingbox.model.SavingBox$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return BEROctetStringParser.onNavigationEvent(this.f$0, (decodeDimensions) obj);
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.model.SavingBox$$ExternalSyntheticLambda1
            public final void accept(Object obj) {
                BEROctetStringParser.IAuthTabCallbackDefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: viva.republica.toss.account.savingbox.model.SavingBox$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return BEROctetStringParser.onExtraCallbackWithResult((Throwable) obj);
            }
        };
        writerawOnExtraCallbackWithResult.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.model.SavingBox$$ExternalSyntheticLambda3
            public final void accept(Object obj) {
                BEROctetStringParser.asInterface(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(BEROctetStringParser bEROctetStringParser, decodeDimensions decodedimensions) {
        if (bEROctetStringParser.onExtraCallback) {
            Objects.toString(decodedimensions);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asInterface(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(Throwable th) {
        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "SavingBox", "fetch error", th, (Map) null, 8, (Object) null);
        return Unit.INSTANCE;
    }

    public final writeRaw<decodeDimensions> onExtraCallbackWithResult() throws Throwable {
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29425), 22 - (Process.myTid() >> 22), 24734 - (ViewConfiguration.getTouchSlop() >> 8), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (ViewConfiguration.getEdgeSlop() >> 16)), ImageFormat.getBitsPerPixel(0) + 23, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24734, -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
            }
            writeRaw writerawIAuthTabCallback = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallback(this.onExtraCallbackWithResult.onExtraCallbackWithResult()).IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.savingbox.model.SavingBox$$ExternalSyntheticLambda6
                public final Object invoke(Object obj2) {
                    return BEROctetStringParser.onExtraCallback(this.f$0, (getSizeInBytes) obj2);
                }
            };
            writeRaw<decodeDimensions> writerawOnExtraCallbackWithResult = writerawIAuthTabCallback.onExtraCallbackWithResult(new deserializeIntNullableCollection() { // from class: viva.republica.toss.account.savingbox.model.SavingBox$$ExternalSyntheticLambda7
                public final Object apply(Object obj2) {
                    return BEROctetStringParser.onExtraCallbackWithResult(function1, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
            return writerawOnExtraCallbackWithResult;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeIp onExtraCallbackWithResult(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (deserializeIp) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeIp onExtraCallback(BEROctetStringParser bEROctetStringParser, getSizeInBytes getsizeinbytes) {
        Intrinsics.checkNotNullParameter(getsizeinbytes, "");
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{getsizeinbytes}, iIAuthTabCallback, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2)).booleanValue() && getsizeinbytes.onTransact() != null) {
            decodeDimensions decodedimensions = (decodeDimensions) getsizeinbytes.onTransact();
            if (decodedimensions == null) {
                return null;
            }
            bEROctetStringParser.onNavigationEvent.onExtraCallbackWithResult(decodedimensions);
            return writeRaw.onExtraCallback(decodedimensions);
        }
        return writeRaw.onExtraCallbackWithResult(new RuntimeException(""));
    }

    public final writeRaw<getSizeInBytes> onWarmupCompleted(@Nullable onCollectWhenDestroy oncollectwhendestroy, @Nullable String str, boolean z, @Nullable TypeUtils2 typeUtils2) {
        BitmapUtilWhenMappings bitmapUtilWhenMappingsOnWarmupCompleted;
        BitmapUtilWhenMappings bitmapUtilWhenMappingsOnWarmupCompleted2;
        decodeDimensions decodedimensions = (decodeDimensions) this.onNavigationEvent.onExtraCallback();
        Long lOnExtraCallbackWithResult = null;
        setUseDecodeBufferHelper setusedecodebufferhelperOnTransact = (decodedimensions == null || (bitmapUtilWhenMappingsOnWarmupCompleted2 = decodedimensions.onWarmupCompleted()) == null) ? null : bitmapUtilWhenMappingsOnWarmupCompleted2.onTransact();
        decodeDimensions decodedimensions2 = (decodeDimensions) this.onNavigationEvent.onExtraCallback();
        if (decodedimensions2 != null && (bitmapUtilWhenMappingsOnWarmupCompleted = decodedimensions2.onWarmupCompleted()) != null) {
            lOnExtraCallbackWithResult = bitmapUtilWhenMappingsOnWarmupCompleted.onExtraCallbackWithResult();
        }
        return IAuthTabCallback(new BitmapUtilWhenMappings(str, oncollectwhendestroy, setusedecodebufferhelperOnTransact, z, lOnExtraCallbackWithResult), typeUtils2);
    }

    public static /* synthetic */ writeRaw onExtraCallback(BEROctetStringParser bEROctetStringParser, BitmapUtilWhenMappings bitmapUtilWhenMappings, TypeUtils2 typeUtils2, int i, Object obj) {
        if ((i & 2) != 0) {
            typeUtils2 = null;
        }
        return bEROctetStringParser.IAuthTabCallback(bitmapUtilWhenMappings, typeUtils2);
    }

    public final writeRaw<getSizeInBytes> IAuthTabCallback(@NotNull BitmapUtilWhenMappings bitmapUtilWhenMappings, @Nullable TypeUtils2 typeUtils2) throws Throwable {
        writeRaw<getSizeInBytes> writerawOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(bitmapUtilWhenMappings, "");
        try {
            if (typeUtils2 != null) {
                decodeDimensions decodedimensions = (decodeDimensions) this.onNavigationEvent.onExtraCallback();
                getPixelSizeForBitmapConfig getpixelsizeforbitmapconfig = new getPixelSizeForBitmapConfig(bitmapUtilWhenMappings, null, decodedimensions != null ? decodedimensions.onExtraCallbackWithResult() : null, 2, null);
                getpixelsizeforbitmapconfig.onExtraCallbackWithResult(typeUtils2);
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - MotionEvent.axisFromString("")), 22 - View.resolveSizeAndState(0, 0, 0), 24733 - TextUtils.indexOf((CharSequence) "", '0', 0), -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj = ((Field) objOnExtraCallback).get(null);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 29426), 22 - KeyEvent.normalizeMetaState(0), 24734 - ExpandableListView.getPackedPositionType(0L), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
                }
                writerawOnWarmupCompleted = ((onExitFullscreen) ((Method) objOnExtraCallback2).invoke(obj, null)).IAuthTabCallback(this.onExtraCallbackWithResult.onExtraCallbackWithResult(), getpixelsizeforbitmapconfig);
            } else {
                decodeDimensions decodedimensions2 = (decodeDimensions) this.onNavigationEvent.onExtraCallback();
                getSizeInByteForBitmap getsizeinbyteforbitmap = new getSizeInByteForBitmap(bitmapUtilWhenMappings, null, decodedimensions2 != null ? decodedimensions2.onExtraCallbackWithResult() : null, 2, null);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (Process.myTid() >> 22)), 22 - ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getTouchSlop() >> 8) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
                }
                Object obj2 = ((Field) objOnExtraCallback3).get(null);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1328718023);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29427 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 23, 24733 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -2121424471, false, "IAuthTabCallbackStubProxy", new Class[0]);
                }
                writerawOnWarmupCompleted = ((onExitFullscreen) ((Method) objOnExtraCallback4).invoke(obj2, null)).onWarmupCompleted(this.onExtraCallbackWithResult.onExtraCallbackWithResult(), getsizeinbyteforbitmap);
            }
            writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(RxUtils.onExtraCallbackWithResult((Object) null));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            final Function1 function1 = new Function1() { // from class: viva.republica.toss.account.savingbox.model.SavingBox$$ExternalSyntheticLambda4
                public final Object invoke(Object obj3) {
                    return BEROctetStringParser.onExtraCallbackWithResult(this.f$0, (getSizeInBytes) obj3);
                }
            };
            writeRaw<getSizeInBytes> writerawOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new deserializeFloat() { // from class: viva.republica.toss.account.savingbox.model.SavingBox$$ExternalSyntheticLambda5
                public final void accept(Object obj3) {
                    BEROctetStringParser.asBinder(function1, obj3);
                }
            });
            Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
            return writerawOnNavigationEvent;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asBinder(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(BEROctetStringParser bEROctetStringParser, getSizeInBytes getsizeinbytes) {
        decodeDimensions decodedimensions;
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{getsizeinbytes}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback())).booleanValue() && (decodedimensions = (decodeDimensions) getsizeinbytes.onTransact()) != null) {
            bEROctetStringParser.onNavigationEvent.onExtraCallbackWithResult(decodedimensions);
        }
        return Unit.INSTANCE;
    }

    public final writeRaw<getSizeInBytes> onExtraCallbackWithResult(@NotNull setUseDecodeBufferHelper setusedecodebufferhelper, @Nullable Long l) {
        BitmapUtilWhenMappings bitmapUtilWhenMappingsOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(setusedecodebufferhelper, "");
        decodeDimensions decodedimensions = (decodeDimensions) this.onNavigationEvent.onExtraCallback();
        if (decodedimensions != null && (bitmapUtilWhenMappingsOnWarmupCompleted = decodedimensions.onWarmupCompleted()) != null) {
            return onExtraCallback(this, new BitmapUtilWhenMappings(bitmapUtilWhenMappingsOnWarmupCompleted.IAuthTabCallback(), bitmapUtilWhenMappingsOnWarmupCompleted.onExtraCallback(), setusedecodebufferhelper, bitmapUtilWhenMappingsOnWarmupCompleted.onNavigationEvent(), l), null, 2, null);
        }
        writeRaw<getSizeInBytes> writerawOnExtraCallbackWithResult = writeRaw.onExtraCallbackWithResult(new RuntimeException(""));
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
        return writerawOnExtraCallbackWithResult;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(BEROctetStringParser.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        BEROctetStringParser bEROctetStringParser = (BEROctetStringParser) obj;
        return Intrinsics.areEqual(this.onExtraCallbackWithResult, bEROctetStringParser.onExtraCallbackWithResult) && Intrinsics.areEqual(this.onNavigationEvent, bEROctetStringParser.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallbackWithResult.onTransact(), bEROctetStringParser.onExtraCallbackWithResult.onTransact());
    }

    public int hashCode() {
        return (this.onExtraCallbackWithResult.hashCode() * 31) + this.onNavigationEvent.hashCode();
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        @JvmStatic
        public final BEROctetStringParser onWarmupCompleted(@NotNull onDisclaimerClick ondisclaimerclick) {
            Intrinsics.checkNotNullParameter(ondisclaimerclick, "");
            if (!BEROctetStringParser.onWarmupCompleted.containsKey(ondisclaimerclick.onExtraCallbackWithResult())) {
                BEROctetStringParser.onWarmupCompleted.put(ondisclaimerclick.onExtraCallbackWithResult(), new BEROctetStringParser(ondisclaimerclick));
            }
            Object obj = BEROctetStringParser.onWarmupCompleted.get(ondisclaimerclick.onExtraCallbackWithResult());
            Intrinsics.checkNotNull(obj);
            return (BEROctetStringParser) obj;
        }

        @JvmStatic
        public final BEROctetStringParser onExtraCallback() {
            onDisclaimerClick ondisclaimerclickIAuthTabCallbackStub = DERConstructedSet.onNavigationEvent.IAuthTabCallbackStub();
            if (ondisclaimerclickIAuthTabCallbackStub != null) {
                return onWarmupCompleted(ondisclaimerclickIAuthTabCallbackStub);
            }
            return null;
        }
    }
}
