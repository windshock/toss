package o;

import android.content.Context;
import im.toss.core.tracker.LogStoreManager$;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetDetectingInterval {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asInterface;
    private static final AppSetIdAndScope1 onWarmupCompleted;
    private final getRetrofit IAuthTabCallback;
    private final ExtractFeature asBinder;
    private final Context onExtraCallback;
    private final Map<String, ComputeLandmarkConfidence<Deinitialize>> onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final File onTransact;

    public static /* synthetic */ boolean IAuthTabCallback(File file) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(file);
        }
        onWarmupCompleted(file);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i6);
        int i9 = ~i2;
        int i10 = (~(i9 | i)) | i8;
        int i11 = ~i6;
        int i12 = i11 | i;
        int i13 = i10 | (~i12);
        int i14 = i7 | i2;
        int i15 = i8 | (~i14);
        int i16 = (~(i6 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i2));
        int i17 = i + i2 + i3 + ((-1254723898) * i4) + ((-1667789834) * i5);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i) + 1379663872 + ((-481802647) * i2) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i3) + ((-1033371648) * i4) + ((-106430464) * i5) + (1552875520 * i18);
        int i20 = ((i * (-402395399)) - 1316031342) + (i2 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i3 * (-402393527)) + (i4 * (-1219896714)) + (i5 * (-610841306)) + (i18 * (-825819136));
        return i19 + ((i20 * i20) * (-1063190528)) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public GetDetectingInterval(@NotNull Context context, @NotNull File file, int i, @NotNull getRetrofit getretrofit, boolean z, @Nullable ExtractFeature extractFeature) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(getretrofit, "");
        this.onExtraCallback = context;
        this.onTransact = file;
        this.onNavigationEvent = i;
        this.IAuthTabCallback = getretrofit;
        this.asBinder = extractFeature;
        this.onExtraCallbackWithResult = new ConcurrentHashMap();
        if (z) {
            onExtraCallback();
            int i2 = IAuthTabCallbackStub + 37;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        }
        int i4 = IAuthTabCallbackDefault + 7;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetDetectingInterval(Context context, File file, int i, getRetrofit getretrofit, boolean z, ExtractFeature extractFeature, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        getRetrofit getretrofit2;
        boolean z2;
        ExtractFeature extractFeature2;
        if ((i2 & 8) != 0) {
            int i3 = IAuthTabCallbackStub + 81;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            EstimateFaceQuality estimateFaceQuality = EstimateFaceQuality.onWarmupCompleted;
            int i5 = IAuthTabCallbackDefault + 13;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 3;
            } else {
                int i7 = 2 % 2;
            }
            getretrofit2 = estimateFaceQuality;
        } else {
            getretrofit2 = getretrofit;
        }
        if ((i2 & 16) != 0) {
            int i8 = IAuthTabCallbackDefault + 49;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 32) != 0) {
            int i10 = IAuthTabCallbackDefault + 53;
            IAuthTabCallbackStub = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            extractFeature2 = null;
        } else {
            extractFeature2 = extractFeature;
        }
        this(context, file, i, getretrofit2, z2, extractFeature2);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(GetDetectingInterval getDetectingInterval) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getDetectingInterval.IAuthTabCallback();
        int i4 = IAuthTabCallbackDefault + 121;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String onExtraCallback(@NotNull String str, @Nullable String str2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                int i3 = 8 / 0;
                if (str2 != null) {
                    str = str + "/" + str2;
                }
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                if (str2 != null) {
                }
            }
            int i4 = onWarmupCompleted + 17;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
            }
            return str;
        }

        public final Pair<String, String> onNavigationEvent(@NotNull String str) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            List listSplit$default = StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, (Object) null);
            int size = listSplit$default.size();
            if (size == 1) {
                return new Pair<>(listSplit$default.get(0), (Object) null);
            }
            if (size != 2) {
                return new Pair<>(str, (Object) null);
            }
            Pair<String, String> pair = new Pair<>(listSplit$default.get(0), listSplit$default.get(1));
            int i4 = onNavigationEvent + 11;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return pair;
        }
    }

    static {
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("LogStoreManager");
        Intrinsics.checkNotNullExpressionValue(appSetIdAndScope1OnExtraCallbackWithResult, "");
        onWarmupCompleted = appSetIdAndScope1OnExtraCallbackWithResult;
        int i = asInterface + 41;
        IAuthTabCallback_Parcel = i % 128;
        int i2 = i % 2;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        int label;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = GetDetectingInterval.this.new onExtraCallbackWithResult(access13800Var);
            int i2 = onExtraCallbackWithResult + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 47 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 71;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i3 + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i5 != 0) {
                GetDetectingInterval.onExtraCallbackWithResult(GetDetectingInterval.this);
                Unit unit = Unit.INSTANCE;
                obj2.hashCode();
                throw null;
            }
            GetDetectingInterval.onExtraCallbackWithResult(GetDetectingInterval.this);
            Unit unit2 = Unit.INSTANCE;
            int i6 = onExtraCallbackWithResult + 35;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                return unit2;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        maybeUpdateAnimatable.onNavigationEvent(ComponentModelb.onExtraCallback, putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new onExtraCallbackWithResult(null), 2, (Object) null);
        int i2 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }

    private static final boolean onWarmupCompleted(File file) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            file.isFile();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!file.isFile()) {
            return false;
        }
        int i3 = IAuthTabCallbackDefault + 125;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (file.isHidden()) {
            return false;
        }
        int i5 = IAuthTabCallbackStub + 25;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        File[] fileArrListFiles = this.onTransact.listFiles();
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file);
                }
            }
            for (File file2 : arrayList) {
                int i2 = IAuthTabCallbackStub + 73;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                String name = file2.getName();
                if (!Intrinsics.areEqual(name, "quarantine")) {
                    int i4 = IAuthTabCallbackDefault + 29;
                    IAuthTabCallbackStub = i4 % 128;
                    Object obj = null;
                    if (i4 % 2 != 0) {
                        file2.listFiles();
                        obj.hashCode();
                        throw null;
                    }
                    File[] fileArrListFiles2 = file2.listFiles();
                    if (fileArrListFiles2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (File file3 : fileArrListFiles2) {
                            int i5 = IAuthTabCallbackStub + 17;
                            IAuthTabCallbackDefault = i5 % 128;
                            int i6 = i5 % 2;
                            if (file3.isFile()) {
                                int i7 = IAuthTabCallbackStub + 59;
                                IAuthTabCallbackDefault = i7 % 128;
                                int i8 = i7 % 2;
                                if (!file3.isHidden()) {
                                    int i9 = IAuthTabCallbackDefault + 105;
                                    IAuthTabCallbackStub = i9 % 128;
                                    int i10 = i9 % 2;
                                    arrayList2.add(file3);
                                }
                            }
                        }
                        ArrayList<File> arrayList3 = new ArrayList();
                        int length = fileArrListFiles2.length;
                        int i11 = 0;
                        while (i11 < length) {
                            int i12 = IAuthTabCallbackDefault + 41;
                            IAuthTabCallbackStub = i12 % 128;
                            int i13 = i12 % 2;
                            File file4 = fileArrListFiles2[i11];
                            if (file4.isDirectory()) {
                                arrayList3.add(file4);
                            }
                            i11++;
                            int i14 = IAuthTabCallbackDefault + 45;
                            IAuthTabCallbackStub = i14 % 128;
                            int i15 = i14 % 2;
                        }
                        if (!arrayList2.isEmpty()) {
                            int i16 = IAuthTabCallbackDefault + 41;
                            IAuthTabCallbackStub = i16 % 128;
                            int i17 = i16 % 2;
                            getRetrofit getretrofit = this.IAuthTabCallback;
                            Intrinsics.checkNotNull(name);
                            if (getretrofit.onWarmupCompleted(name, null)) {
                                String strOnExtraCallback = Companion.onExtraCallback(name, null);
                                this.onExtraCallbackWithResult.put(strOnExtraCallback, onExtraCallbackWithResult(this.onExtraCallback, strOnExtraCallback));
                            }
                        }
                        for (File file5 : arrayList3) {
                            String name2 = file5.getName();
                            File[] fileArrListFiles3 = file5.listFiles((FileFilter) new LogStoreManager$.ExternalSyntheticLambda0());
                            if (fileArrListFiles3 != null) {
                                if (!(fileArrListFiles3.length == 0)) {
                                    getRetrofit getretrofit2 = this.IAuthTabCallback;
                                    Intrinsics.checkNotNull(name);
                                    if (getretrofit2.onWarmupCompleted(name, name2)) {
                                        String strOnExtraCallback2 = Companion.onExtraCallback(name, name2);
                                        this.onExtraCallbackWithResult.put(strOnExtraCallback2, onExtraCallbackWithResult(this.onExtraCallback, strOnExtraCallback2));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final ComputeLandmarkConfidence<? extends Deinitialize> onWarmupCompleted(@NotNull String str, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ComputeLandmarkConfidence<Deinitialize> computeLandmarkConfidenceRemove = this.onExtraCallbackWithResult.remove(str);
        if (computeLandmarkConfidenceRemove == null) {
            return null;
        }
        int i4 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        if (z) {
            computeLandmarkConfidenceRemove.onExtraCallbackWithResult();
        }
        int i6 = IAuthTabCallbackDefault + 117;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        return computeLandmarkConfidenceRemove;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GetDetectingInterval getDetectingInterval = (GetDetectingInterval) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return getDetectingInterval.onExtraCallbackWithResult.get(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        getDetectingInterval.onExtraCallbackWithResult.get(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ComputeLandmarkConfidence<Deinitialize> onExtraCallbackWithResult(@NotNull Context context, @NotNull String str) {
        ComputeLandmarkConfidence<Deinitialize> computeLandmarkConfidence;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Map<String, ComputeLandmarkConfidence<Deinitialize>> map = this.onExtraCallbackWithResult;
            ComputeLandmarkConfidence<Deinitialize> computeLandmarkConfidence2 = map.get(str);
            if (computeLandmarkConfidence2 == null) {
                Pair<String, String> pairOnNavigationEvent = Companion.onNavigationEvent(str);
                String str2 = (String) pairOnNavigationEvent.onExtraCallbackWithResult();
                String str3 = (String) pairOnNavigationEvent.IAuthTabCallback();
                if (StringsKt.isBlank(str2)) {
                    throw new IllegalArgumentException(("Invalid storeId from storeName: " + str).toString());
                }
                Integer numOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(str2, str3);
                computeLandmarkConfidence2 = new ComputeLandmarkConfidence<>(context, str, numOnNavigationEvent != null ? numOnNavigationEvent.intValue() : this.onNavigationEvent, null, this.onTransact, this.asBinder, 8, null);
                map.put(str, computeLandmarkConfidence2);
            }
            computeLandmarkConfidence = computeLandmarkConfidence2;
        }
        return computeLandmarkConfidence;
    }

    public final Collection<ComputeLandmarkConfidence<? extends Deinitialize>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Collection<ComputeLandmarkConfidence<Deinitialize>> collectionValues = this.onExtraCallbackWithResult.values();
        int i4 = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return collectionValues;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback(@NotNull InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
            String strOnExtraCallbackWithResult = onExtraCallbackWithResult(interfaceC0059deInitialize);
            interfaceC0059deInitialize.IAuthTabCallbackStubProxy();
            onExtraCallbackWithResult(this.onExtraCallback, strOnExtraCallbackWithResult).onNavigationEvent((ComputeLandmarkConfidence<Deinitialize>) interfaceC0059deInitialize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
        String strOnExtraCallbackWithResult2 = onExtraCallbackWithResult(interfaceC0059deInitialize);
        interfaceC0059deInitialize.IAuthTabCallbackStubProxy();
        onExtraCallbackWithResult(this.onExtraCallback, strOnExtraCallbackWithResult2).onNavigationEvent((ComputeLandmarkConfidence<Deinitialize>) interfaceC0059deInitialize);
        int i3 = IAuthTabCallbackStub + 105;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String onExtraCallbackWithResult(@NotNull InterfaceC0059deInitialize interfaceC0059deInitialize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interfaceC0059deInitialize, "");
        String strOnExtraCallback = Companion.onExtraCallback(interfaceC0059deInitialize.onPostMessage(), interfaceC0059deInitialize.onMinimized());
        int i4 = IAuthTabCallbackDefault + 97;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return strOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        GetDetectingInterval getDetectingInterval = (GetDetectingInterval) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ComputeLandmarkConfidence<Deinitialize> computeLandmarkConfidenceOnExtraCallbackWithResult = getDetectingInterval.onExtraCallbackWithResult(getDetectingInterval.onExtraCallback, Companion.onExtraCallback(str, str2));
        int i4 = IAuthTabCallbackDefault + 83;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return computeLandmarkConfidenceOnExtraCallbackWithResult;
        }
        throw null;
    }

    public final ComputeLandmarkConfidence<? extends Deinitialize> onExtraCallback(@NotNull String str) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (ComputeLandmarkConfidence) onNavigationEvent(467059339, -467059338, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, str}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
    }

    public final ComputeLandmarkConfidence<Deinitialize> onExtraCallbackWithResult(@NotNull String str, @Nullable String str2) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (ComputeLandmarkConfidence) onNavigationEvent(2046694674, -2046694674, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, str, str2}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback);
    }
}
