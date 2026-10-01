package o;

import android.content.res.AssetManager;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.MaxFullscreenAdImplExternalSyntheticLambda3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import run.granite.BundleEvaluator;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxFullscreenAdImplExternalSyntheticLambda3 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    public static final MaxFullscreenAdImplExternalSyntheticLambda3 onWarmupCompleted = new MaxFullscreenAdImplExternalSyntheticLambda3();

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            MaxFullscreenAdImplExternalSyntheticLambda3 maxFullscreenAdImplExternalSyntheticLambda3 = MaxFullscreenAdImplExternalSyntheticLambda3.this;
            if (i3 != 0) {
                return maxFullscreenAdImplExternalSyntheticLambda3.onExtraCallback((AssetManager) null, (String) null, (access13800<? super onWarmupCompleted>) this);
            }
            maxFullscreenAdImplExternalSyntheticLambda3.onExtraCallback((AssetManager) null, (String) null, (access13800<? super onWarmupCompleted>) this);
            throw null;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            MaxFullscreenAdImplExternalSyntheticLambda3 maxFullscreenAdImplExternalSyntheticLambda3 = MaxFullscreenAdImplExternalSyntheticLambda3.this;
            if (i3 != 0) {
                return maxFullscreenAdImplExternalSyntheticLambda3.IAuthTabCallback(null, null, null, null, null, this);
            }
            maxFullscreenAdImplExternalSyntheticLambda3.IAuthTabCallback(null, null, null, null, null, this);
            throw null;
        }
    }

    static {
        int i = onExtraCallbackWithResult + 103;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(onWarmupCompleted onwarmupcompleted, ReactContext reactContext, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 11;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onwarmupcompleted, reactContext, str);
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        int i5 = onNavigationEvent + 33;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(byte[] bArr, String str, ReactContext reactContext) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(bArr, str, reactContext);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(bArr, str, reactContext);
        int i3 = onNavigationEvent + 43;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    private MaxFullscreenAdImplExternalSyntheticLambda3() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x015d, code lost:
    
        if (onExtraCallbackWithResult(r13, r5, r4) == r6) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull ReactContext reactContext, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, ? extends Object> map, @NotNull access13800<? super Unit> access13800Var) {
        onNavigationEvent onnavigationevent;
        String str4;
        Map<String, ? extends Object> map2;
        String str5;
        String str6;
        AssetManager assets;
        final String str7;
        Map<String, ? extends Object> map3;
        final ReactContext reactContext2;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (!(access13800Var instanceof onNavigationEvent)) {
            onnavigationevent = new onNavigationEvent(access13800Var);
        } else {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i4 = onnavigationevent.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i4 - 2147483648;
            }
        }
        Object objOnExtraCallback = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = onnavigationevent.label;
        if (i5 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            try {
                assets = reactContext.getAssets();
                Intrinsics.checkNotNullExpressionValue(assets, "");
                onnavigationevent.L$0 = reactContext;
                onnavigationevent.L$1 = str;
                str7 = str2;
                onnavigationevent.L$2 = str7;
                str4 = str3;
                try {
                    onnavigationevent.L$3 = str4;
                    map2 = map;
                } catch (IAuthTabCallback e) {
                    e = e;
                    map2 = map;
                    str5 = str4;
                    str6 = str;
                    Map mapOnWarmupCompleted = access8100.onWarmupCompleted(onExtraCallbackWithResult(map2), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", str5), getWrite.IAuthTabCallback("remoteBundlePath", str6)}));
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "import_lazy_bundle_not_found", e, mapOnWarmupCompleted);
                    Objects.toString(mapOnWarmupCompleted);
                    throw e;
                }
            } catch (IAuthTabCallback e2) {
                e = e2;
                str4 = str3;
            }
            try {
                onnavigationevent.L$4 = map2;
                onnavigationevent.label = 1;
                objOnExtraCallback = onExtraCallback(assets, str, (access13800<? super onWarmupCompleted>) onnavigationevent);
                if (objOnExtraCallback != objOnWarmupCompleted) {
                    int i6 = IAuthTabCallback + 39;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 50 / 0;
                    }
                    str6 = str;
                    map3 = map2;
                    reactContext2 = reactContext;
                    str5 = str4;
                }
                return objOnWarmupCompleted;
            } catch (IAuthTabCallback e3) {
                e = e3;
                str5 = str4;
                str6 = str;
                Map mapOnWarmupCompleted2 = access8100.onWarmupCompleted(onExtraCallbackWithResult(map2), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", str5), getWrite.IAuthTabCallback("remoteBundlePath", str6)}));
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "import_lazy_bundle_not_found", e, mapOnWarmupCompleted2);
                Objects.toString(mapOnWarmupCompleted2);
                throw e;
            }
        }
        if (i5 != 1) {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnExtraCallback);
            return Unit.INSTANCE;
        }
        map3 = (Map) onnavigationevent.L$4;
        str5 = (String) onnavigationevent.L$3;
        str7 = (String) onnavigationevent.L$2;
        str6 = (String) onnavigationevent.L$1;
        reactContext2 = (ReactContext) onnavigationevent.L$0;
        try {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            int i8 = onNavigationEvent + 39;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        } catch (IAuthTabCallback e4) {
            e = e4;
            map2 = map3;
            Map mapOnWarmupCompleted22 = access8100.onWarmupCompleted(onExtraCallbackWithResult(map2), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", str5), getWrite.IAuthTabCallback("remoteBundlePath", str6)}));
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onExtraCallbackWithResult("react_native_debug", "import_lazy_bundle_not_found", e, mapOnWarmupCompleted22);
            Objects.toString(mapOnWarmupCompleted22);
            throw e;
        }
        final onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objOnExtraCallback;
        Map mapOnWarmupCompleted3 = access8100.onWarmupCompleted(onExtraCallbackWithResult(map3), access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("from", str5), getWrite.IAuthTabCallback("remoteBundlePath", str6), getWrite.IAuthTabCallback("evaluateUrl", str7), getWrite.IAuthTabCallback("fileSize", access14000.onExtraCallback(onwarmupcompleted.onExtraCallback())), getWrite.IAuthTabCallback("bundleSource", onwarmupcompleted.onNavigationEvent())}));
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "react_native_debug", "import_lazy_evaluating_bundle", mapOnWarmupCompleted3, (String) null, false, (String) null, 56, (Object) null);
        Objects.toString(mapOnWarmupCompleted3);
        Function0<Unit> function0 = new Function0() { // from class: im.toss.rn.toss.core.TossImportLazyBundleEvaluator$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i10 = 2 % 2;
                int i11 = onExtraCallback + 33;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                MaxFullscreenAdImplExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted2 = onwarmupcompleted;
                if (i12 != 0) {
                    return MaxFullscreenAdImplExternalSyntheticLambda3.onNavigationEvent(onwarmupcompleted2, reactContext2, str7);
                }
                MaxFullscreenAdImplExternalSyntheticLambda3.onNavigationEvent(onwarmupcompleted2, reactContext2, str7);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        onnavigationevent.L$0 = access15400.onNavigationEvent(reactContext2);
        onnavigationevent.L$1 = access15400.onNavigationEvent(str6);
        onnavigationevent.L$2 = access15400.onNavigationEvent(str7);
        onnavigationevent.L$3 = access15400.onNavigationEvent(str5);
        onnavigationevent.L$4 = access15400.onNavigationEvent(map3);
        onnavigationevent.L$5 = access15400.onNavigationEvent(onwarmupcompleted);
        onnavigationevent.L$6 = access15400.onNavigationEvent(mapOnWarmupCompleted3);
        onnavigationevent.label = 2;
    }

    private static final Unit onExtraCallback(onWarmupCompleted onwarmupcompleted, ReactContext reactContext, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onwarmupcompleted.onWarmupCompleted(reactContext, str);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(byte[] bArr, String str, ReactContext reactContext) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        BundleEvaluator.Companion.IAuthTabCallback(bArr, str, reactContext);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class onExtraCallback implements Runnable {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Function0<Unit> IAuthTabCallback;
        final /* synthetic */ maybeRemoveAttachStateListener<Unit> onNavigationEvent;
        final /* synthetic */ ReactContext onWarmupCompleted;

        onExtraCallback(maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener, ReactContext reactContext, Function0<Unit> function0) {
            this.onNavigationEvent = mayberemoveattachstatelistener;
            this.onWarmupCompleted = reactContext;
            this.IAuthTabCallback = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (this.onNavigationEvent.onNavigationEvent()) {
                    try {
                        if (this.onWarmupCompleted.hasActiveReactInstance()) {
                            int i3 = onExtraCallback + 105;
                            onExtraCallbackWithResult = i3 % 128;
                            int i4 = i3 % 2;
                            this.IAuthTabCallback.invoke();
                            if (this.onNavigationEvent.onNavigationEvent()) {
                                maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener = this.onNavigationEvent;
                                Result.Companion companion = Result.Companion;
                                mayberemoveattachstatelistener.resumeWith(Result.constructor-impl(Unit.INSTANCE));
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("React instance is gone before bundle evaluation");
                    } catch (CancellationException e) {
                        this.onNavigationEvent.onExtraCallback(e);
                        return;
                    } catch (Throwable th) {
                        if (this.onNavigationEvent.onNavigationEvent()) {
                            maybeRemoveAttachStateListener<Unit> mayberemoveattachstatelistener2 = this.onNavigationEvent;
                            Result.Companion companion2 = Result.Companion;
                            mayberemoveattachstatelistener2.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            this.onNavigationEvent.onNavigationEvent();
            throw null;
        }
    }

    private final Map<String, Object> onExtraCallbackWithResult(Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = map.get("failedBundleName");
            if (obj == null) {
                obj = map.get("remoteBundleName");
                int i3 = onNavigationEvent + 97;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            return access8100.IAuthTabCallback(map, getWrite.IAuthTabCallback("failedBundleName", obj));
        }
        map.get("failedBundleName");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull AssetManager assetManager, @NotNull String str, @NotNull access13800<? super onWarmupCompleted> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onNavigationEvent = i3 % 128;
        Throwable th = null;
        if (i3 % 2 == 0) {
            boolean z = access13800Var instanceof onExtraCallbackWithResult;
            throw null;
        }
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i4 = onextracallbackwithresult.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i4 - 2147483648;
                int i5 = onNavigationEvent + 53;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnWarmupCompleted = onextracallbackwithresult.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i7 = onextracallbackwithresult.label;
        if (i7 != 0) {
            int i8 = onNavigationEvent;
            int i9 = i8 + 63;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0 ? i7 != 1 : i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i10 = i8 + 85;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            str = (String) onextracallbackwithresult.L$1;
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
        } else {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            if (!StringsKt.startsWith$default(str, "assets://", false, 2, (Object) null)) {
                File file = new File(str);
                if (file.exists()) {
                    return new onWarmupCompleted.C0008onWarmupCompleted(str, file.length());
                }
                throw new IAuthTabCallback("Remote bundle file does not exist: " + str, th, i, th);
            }
            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(assetManager);
            onextracallbackwithresult.L$1 = str;
            onextracallbackwithresult.label = 1;
            objOnWarmupCompleted = onWarmupCompleted(assetManager, str, (access13800<? super byte[]>) onextracallbackwithresult);
            if (objOnWarmupCompleted == objOnWarmupCompleted2) {
                int i12 = onNavigationEvent + 105;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                return objOnWarmupCompleted2;
            }
        }
        return new onWarmupCompleted.onNavigationEvent(str, (byte[]) objOnWarmupCompleted);
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super byte[]>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ AssetManager $assetManager;
        final /* synthetic */ String $bundleFilePath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(String str, AssetManager assetManager, access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
            this.$bundleFilePath = str;
            this.$assetManager = assetManager;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(this.$bundleFilePath, this.$assetManager, access13800Var);
            int i2 = onExtraCallback + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 121;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super byte[]> access13800Var) throws IOException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 107;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws IOException {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 113;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = i4 + 97;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            ResultKt.onNavigationEvent(obj);
            String strRemovePrefix = StringsKt.removePrefix(this.$bundleFilePath, "assets://");
            Throwable th = null;
            if (!(!StringsKt.isBlank(strRemovePrefix))) {
                throw new IAuthTabCallback("Asset bundle path is blank: " + this.$bundleFilePath, th, i, th);
            }
            try {
                InputStream inputStreamOpen = this.$assetManager.open(strRemovePrefix);
                try {
                    Intrinsics.checkNotNull(inputStreamOpen);
                    byte[] bytes = ByteStreamsKt.readBytes(inputStreamOpen);
                    CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                    int i8 = onNavigationEvent + 107;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        return bytes;
                    }
                    th.hashCode();
                    throw null;
                } finally {
                }
            } catch (IOException e) {
                throw new IAuthTabCallback("Asset bundle file does not exist: " + this.$bundleFilePath, e);
            }
        }
    }

    private final Object onWarmupCompleted(AssetManager assetManager, String str, access13800<? super byte[]> access13800Var) {
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new asInterface(str, assetManager, null), access13800Var);
        int i2 = IAuthTabCallback + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static abstract class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private final long onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onWarmupCompleted;

        public /* synthetic */ onWarmupCompleted(String str, long j, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2);
        }

        public abstract void onWarmupCompleted(@NotNull ReactContext reactContext, @NotNull String str);

        private onWarmupCompleted(String str, long j, String str2) {
            this.onWarmupCompleted = str;
            this.onExtraCallbackWithResult = j;
            this.onNavigationEvent = str2;
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 97;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onWarmupCompleted;
            if (i3 != 0) {
                int i4 = 73 / 0;
            }
            return str;
        }

        public long onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            long j = this.onExtraCallbackWithResult;
            int i5 = i3 + 53;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return j;
            }
            throw null;
        }

        public final String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 63;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 111;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public static final class onNavigationEvent extends onWarmupCompleted {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            private final byte[] onExtraCallback;
            private final String onNavigationEvent;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                int i3 = i2 % 128;
                onWarmupCompleted = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof onNavigationEvent)) {
                    int i4 = i3 + 115;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
                if (!Intrinsics.areEqual(this.onNavigationEvent, onnavigationevent.onNavigationEvent)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.onExtraCallback, onnavigationevent.onExtraCallback)) {
                    return true;
                }
                int i6 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i6 % 128;
                return i6 % 2 != 0;
            }

            public int hashCode() {
                int iHashCode;
                int iHashCode2;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 35;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    iHashCode = this.onNavigationEvent.hashCode() / 41;
                    iHashCode2 = Arrays.hashCode(this.onExtraCallback);
                } else {
                    iHashCode = this.onNavigationEvent.hashCode() * 31;
                    iHashCode2 = Arrays.hashCode(this.onExtraCallback);
                }
                int i3 = iHashCode + iHashCode2;
                int i4 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return i3;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Asset(bundleFilePath=" + this.onNavigationEvent + ", scriptData=" + Arrays.toString(this.onExtraCallback) + ")";
                int i2 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override // o.MaxFullscreenAdImplExternalSyntheticLambda3.onWarmupCompleted
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 37;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                String str = this.onNavigationEvent;
                if (i3 != 0) {
                    int i4 = 58 / 0;
                }
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public onNavigationEvent(@NotNull String str, @NotNull byte[] bArr) {
                super(str, bArr.length, "asset", null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(bArr, "");
                this.onNavigationEvent = str;
                this.onExtraCallback = bArr;
            }

            @Override // o.MaxFullscreenAdImplExternalSyntheticLambda3.onWarmupCompleted
            public void onWarmupCompleted(@NotNull ReactContext reactContext, @NotNull String str) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(reactContext, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    BundleEvaluator.Companion.IAuthTabCallback(this.onExtraCallback, str, reactContext);
                } else {
                    Intrinsics.checkNotNullParameter(reactContext, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    BundleEvaluator.Companion.IAuthTabCallback(this.onExtraCallback, str, reactContext);
                    int i3 = 84 / 0;
                }
            }
        }

        /* renamed from: o.MaxFullscreenAdImplExternalSyntheticLambda3$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0008onWarmupCompleted extends onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            private final String onExtraCallback;
            private final long onWarmupCompleted;

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = onNavigationEvent + 69;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof C0008onWarmupCompleted)) {
                    int i4 = onNavigationEvent + 97;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                C0008onWarmupCompleted c0008onWarmupCompleted = (C0008onWarmupCompleted) obj;
                if (Intrinsics.areEqual(this.onExtraCallback, c0008onWarmupCompleted.onExtraCallback)) {
                    if (this.onWarmupCompleted == c0008onWarmupCompleted.onWarmupCompleted) {
                        return true;
                    }
                    int i6 = IAuthTabCallback + 83;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 77 / 0;
                    }
                    return false;
                }
                int i8 = onNavigationEvent + 59;
                int i9 = i8 % 128;
                IAuthTabCallback = i9;
                boolean z = i8 % 2 != 0;
                int i10 = i9 + 63;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 != 0) {
                    return z;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 1;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.onExtraCallback.hashCode();
                return i3 == 0 ? (iHashCode % 104) >> Long.hashCode(this.onWarmupCompleted) : (iHashCode * 31) + Long.hashCode(this.onWarmupCompleted);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "FilePath(bundleFilePath=" + this.onExtraCallback + ", fileSize=" + this.onWarmupCompleted + ")";
                int i2 = onNavigationEvent + 33;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0008onWarmupCompleted(@NotNull String str, long j) {
                super(str, j, "file", null);
                Intrinsics.checkNotNullParameter(str, "");
                this.onExtraCallback = str;
                this.onWarmupCompleted = j;
            }

            @Override // o.MaxFullscreenAdImplExternalSyntheticLambda3.onWarmupCompleted
            public String IAuthTabCallback() {
                int i = 2 % 2;
                int i2 = onNavigationEvent;
                int i3 = i2 + 87;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                String str = this.onExtraCallback;
                int i5 = i2 + 13;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            @Override // o.MaxFullscreenAdImplExternalSyntheticLambda3.onWarmupCompleted
            public long onExtraCallback() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 65;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                long j = this.onWarmupCompleted;
                int i4 = i2 + 75;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return j;
                }
                obj.hashCode();
                throw null;
            }

            @Override // o.MaxFullscreenAdImplExternalSyntheticLambda3.onWarmupCompleted
            public void onWarmupCompleted(@NotNull ReactContext reactContext, @NotNull String str) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 83;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(reactContext, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    BundleEvaluator.Companion.IAuthTabCallback(IAuthTabCallback(), str, reactContext);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(reactContext, "");
                Intrinsics.checkNotNullParameter(str, "");
                BundleEvaluator.Companion.IAuthTabCallback(IAuthTabCallback(), str, reactContext);
                int i3 = onNavigationEvent + 25;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        }
    }

    public static final class IAuthTabCallback extends IllegalStateException {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull String str, @Nullable Throwable th) {
            super(str, th);
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IAuthTabCallback(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = onNavigationEvent + 9;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 81;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                th = null;
            }
            this(str, th);
        }
    }

    private final Object onExtraCallbackWithResult(ReactContext reactContext, Function0<Unit> function0, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        setResourceInternal setresourceinternal = new setResourceInternal(access14300.onWarmupCompleted(access13800Var), 1);
        setresourceinternal.onTransact();
        if ((!reactContext.runOnJSQueueThread(new onExtraCallback(setresourceinternal, reactContext, function0))) && setresourceinternal.onNavigationEvent()) {
            Result.Companion companion = Result.Companion;
            setresourceinternal.resumeWith(Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("Failed to enqueue bundle evaluation on JS queue"))));
        }
        Object objIAuthTabCallbackDefault = setresourceinternal.IAuthTabCallbackDefault();
        if (objIAuthTabCallbackDefault == access14300.onWarmupCompleted()) {
            int i2 = onNavigationEvent + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                access14600.IAuthTabCallback(access13800Var);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            access14600.IAuthTabCallback(access13800Var);
            int i3 = onNavigationEvent + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        if (objIAuthTabCallbackDefault != access14300.onWarmupCompleted()) {
            return Unit.INSTANCE;
        }
        int i5 = onNavigationEvent + 73;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return objIAuthTabCallbackDefault;
    }
}
