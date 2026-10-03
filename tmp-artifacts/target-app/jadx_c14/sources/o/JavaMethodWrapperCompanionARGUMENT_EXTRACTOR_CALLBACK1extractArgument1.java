package o;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import im.toss.network.model.BaseApiResponse;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.plcc.bill.PlccBillViewModel$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 extends isTestMode {
    private final Rmipmap<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact> IAuthTabCallback;
    private final Rmipmap<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback> IAuthTabCallbackDefault;
    private final LiveData<List<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1>> IAuthTabCallbackStub;
    private final LiveData<List<Object>> IAuthTabCallbackStubProxy;
    private final LiveData<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact> IAuthTabCallback_Parcel;
    private final LiveData<List<NativeJpegTranscoderFactory>> ICustomTabsCallback;
    private final LiveData<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault> access000;
    private final LiveData<Throwable> access100;
    private final Rmipmap<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault> asBinder;
    private final Rmipmap<List<NativeJpegTranscoderFactory>> asInterface;
    private final LiveData<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback> extraCallback;
    private final LiveData<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault> getInterfaceDescriptor;
    private final Rmipmap<Throwable> onExtraCallback;
    private final MutableLiveData<List<Object>> onExtraCallbackWithResult;
    private final MutableLiveData<List<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1>> onNavigationEvent;
    private String onTransact = "";
    private final Rmipmap<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault> onWarmupCompleted;

    public JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1() {
        MutableLiveData<List<Object>> mutableLiveData = new MutableLiveData<>();
        this.onExtraCallbackWithResult = mutableLiveData;
        this.IAuthTabCallbackStubProxy = onNavigationEvent(mutableLiveData);
        MutableLiveData<List<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1>> mutableLiveData2 = new MutableLiveData<>();
        this.onNavigationEvent = mutableLiveData2;
        this.IAuthTabCallbackStub = onNavigationEvent(mutableLiveData2);
        Rmipmap<List<NativeJpegTranscoderFactory>> rmipmap = new Rmipmap<>();
        this.asInterface = rmipmap;
        this.ICustomTabsCallback = onNavigationEvent((MutableLiveData) rmipmap);
        Rmipmap<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback> rmipmap2 = new Rmipmap<>();
        this.IAuthTabCallbackDefault = rmipmap2;
        this.extraCallback = onNavigationEvent((MutableLiveData) rmipmap2);
        Rmipmap<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact> rmipmap3 = new Rmipmap<>();
        this.IAuthTabCallback = rmipmap3;
        this.IAuthTabCallback_Parcel = onNavigationEvent((MutableLiveData) rmipmap3);
        Rmipmap<Throwable> rmipmap4 = new Rmipmap<>();
        this.onExtraCallback = rmipmap4;
        this.access100 = onNavigationEvent((MutableLiveData) rmipmap4);
        Rmipmap<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault> rmipmap5 = new Rmipmap<>();
        this.asBinder = rmipmap5;
        this.getInterfaceDescriptor = onNavigationEvent((MutableLiveData) rmipmap5);
        Rmipmap<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault> rmipmap6 = new Rmipmap<>();
        this.onWarmupCompleted = rmipmap6;
        this.access000 = onNavigationEvent((MutableLiveData) rmipmap6);
    }

    public final void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onTransact = str;
    }

    public final String onNavigationEvent() {
        return this.onTransact;
    }

    public final LiveData<List<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1>> IAuthTabCallback() {
        return this.IAuthTabCallbackStub;
    }

    public final LiveData<List<NativeJpegTranscoderFactory>> IAuthTabCallbackDefault() {
        return this.ICustomTabsCallback;
    }

    public final LiveData<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback> asBinder() {
        return this.extraCallback;
    }

    public final LiveData<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact> onExtraCallbackWithResult() {
        return this.IAuthTabCallback_Parcel;
    }

    public final LiveData<Throwable> onWarmupCompleted() {
        return this.access100;
    }

    public final LiveData<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault> IAuthTabCallbackStub() {
        return this.getInterfaceDescriptor;
    }

    public final LiveData<JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault> onExtraCallback() {
        return this.access000;
    }

    public final void IAuthTabCallback(@NotNull Context context, @Nullable String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        if (str == null || str.length() == 0) {
            IAuthTabCallback(context);
            return;
        }
        if (z) {
            IAuthTabCallback(context);
            return;
        }
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29427), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, TextUtils.indexOf("", "", 0, 0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971064817);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - Color.green(0)), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 24734 - TextUtils.getCapsMode("", 0, 0), -1144844641, false, "access100", new Class[0]);
            }
            writeRaw<BaseApiResponse<createImageTranscoder>> writerawOnWarmupCompleted = ((InterstitialAdInterstitialAdShowConfigBuilder) ((Method) objOnExtraCallback2).invoke(obj, null)).onWarmupCompleted(str);
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnWarmupCompleted.IAuthTabCallback(new onExtraCallback(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            onExtraCallbackWithResult(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new PlccBillViewModel$.ExternalSyntheticLambda2(this), new PlccBillViewModel$.ExternalSyntheticLambda3(this, context)));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1, Context context, createImageTranscoder createimagetranscoder) {
        Intrinsics.checkNotNullParameter(createimagetranscoder, "");
        onNavigationEvent(javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1, context, createimagetranscoder, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.onExtraCallback.setValue(th);
        return Unit.INSTANCE;
    }

    private final void IAuthTabCallback(Context context) throws Throwable {
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29425 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 24735, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971064817);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 29427), 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24733, -1144844641, false, "access100", new Class[0]);
            }
            writeRaw<BaseApiResponse<createImageTranscoder>> writerawOnNavigationEvent = ((InterstitialAdInterstitialAdShowConfigBuilder) ((Method) objOnExtraCallback2).invoke(obj, null)).onNavigationEvent();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            writeRaw writerawIAuthTabCallback = writerawOnNavigationEvent.IAuthTabCallback(new onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
            onExtraCallbackWithResult(setMessageBytes.onExtraCallbackWithResult(writerawIAuthTabCallback, new PlccBillViewModel$.ExternalSyntheticLambda0(this), new PlccBillViewModel$.ExternalSyntheticLambda1(this, context)));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1, Context context, createImageTranscoder createimagetranscoder) {
        Intrinsics.checkNotNullParameter(createimagetranscoder, "");
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.IAuthTabCallback(context, createimagetranscoder, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.onExtraCallback.setValue(th);
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ createImageTranscoder $billResponse;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isDue;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(createImageTranscoder createimagetranscoder, boolean z, Context context, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$billResponse = createimagetranscoder;
            this.$isDue = z;
            this.$context = context;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.this.new onWarmupCompleted(this.$billResponse, this.$isDue, this.$context, access13800Var);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x01c4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instructions count: 566
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onNavigationEvent(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
            javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.asBinder.setValue(iAuthTabCallbackDefault);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit IAuthTabCallback(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallbackDefault iAuthTabCallbackDefault) {
            javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.onWarmupCompleted.setValue(iAuthTabCallbackDefault);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallbackWithResult(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.IAuthTabCallback iAuthTabCallback) {
            javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.IAuthTabCallbackDefault.setValue(iAuthTabCallback);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onExtraCallbackWithResult(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1, JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_DYNAMIC1.onTransact ontransact) {
            javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.IAuthTabCallback.setValue(ontransact);
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ void onNavigationEvent(JavaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1 javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1, Context context, createImageTranscoder createimagetranscoder, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        javaMethodWrapperCompanionARGUMENT_EXTRACTOR_CALLBACK1extractArgument1.IAuthTabCallback(context, createimagetranscoder, z);
    }

    private final void IAuthTabCallback(Context context, createImageTranscoder createimagetranscoder, boolean z) {
        maybeUpdateAnimatable.onNavigationEvent(ProcessTextApi23ImplExternalSyntheticLambda0.IAuthTabCallback(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(createimagetranscoder, z, context, null), 3, (Object) null);
    }
}
