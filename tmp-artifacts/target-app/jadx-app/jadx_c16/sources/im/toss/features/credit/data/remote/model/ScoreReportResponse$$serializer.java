package im.toss.features.credit.data.remote.model;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.credit.data.remote.model.DetailsButton$;
import im.toss.features.credit.data.response.DisclaimerV2;
import im.toss.features.credit.data.response.DisclaimerV2$$serializer;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.aeu2;
import o.getWriggleLayout;
import o.jp;
import o.okycx;
import o.setAnimationsLoop;
import o.sp;
import o.vyl;
import o.yw;
import org.jetbrains.annotations.NotNull;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ScoreReportResponse$$serializer implements aeu2<ScoreReportResponse> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    public static final ScoreReportResponse$$serializer INSTANCE;
    private static int asBinder = 1;
    private static final SerialDescriptor descriptor;
    private static char onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static char onWarmupCompleted;

    public final SerialDescriptor getDescriptor() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 89;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        SerialDescriptor serialDescriptor = descriptor;
        int i5 = i2 + 81;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return serialDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        onExtraCallbackWithResult();
        ScoreReportResponse$$serializer scoreReportResponse$$serializer = new ScoreReportResponse$$serializer();
        INSTANCE = scoreReportResponse$$serializer;
        setAnimationsLoop setanimationsloop = new setAnimationsLoop("im.toss.features.credit.data.remote.model.ScoreReportResponse", scoreReportResponse$$serializer, 8);
        Object[] objArr = new Object[1];
        a(new char[]{61530, 21107, 13993, 20273, 47043, 30092}, 5 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        setanimationsloop.onWarmupCompleted(((String) objArr[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("descriptions", true);
        Object[] objArr2 = new Object[1];
        a(new char[]{28810, 43915, 35195, 9347, 50877, 41993, 45690, 50932}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7, objArr2);
        setanimationsloop.onWarmupCompleted(((String) objArr2[0]).intern(), true);
        setanimationsloop.onWarmupCompleted("scoreReasonAnalysisInfo", true);
        setanimationsloop.onWarmupCompleted("scoreStatusBoardInfo", true);
        setanimationsloop.onWarmupCompleted("additionalTitle", true);
        setanimationsloop.onWarmupCompleted("disclaimer", true);
        setanimationsloop.onWarmupCompleted("cta", true);
        descriptor = setanimationsloop;
        int i = asBinder + 45;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private ScoreReportResponse$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Lazy[] lazyArrOnExtraCallback = ScoreReportResponse.onExtraCallback();
        KSerializer<?> kSerializer = getWriggleLayout.onNavigationEvent;
        KSerializer<?>[] kSerializerArr = {kSerializer, sp.IAuthTabCallback((KSerializer) lazyArrOnExtraCallback[1].getValue()), sp.IAuthTabCallback(kSerializer), sp.IAuthTabCallback(ScoreReasonAnalysisInfo$$serializer.INSTANCE), sp.IAuthTabCallback(ScoreStatusBoardInfo$$serializer.INSTANCE), kSerializer, sp.IAuthTabCallback(DisclaimerV2$$serializer.INSTANCE), sp.IAuthTabCallback(DetailsButton$.serializer.INSTANCE)};
        int i4 = IAuthTabCallbackStub + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerArr;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.UnknownFieldException */
    public final ScoreReportResponse deserialize(@NotNull Decoder decoder) throws UnknownFieldException {
        int i;
        ScoreStatusBoardInfo scoreStatusBoardInfo;
        List list;
        ScoreReasonAnalysisInfo scoreReasonAnalysisInfo;
        String str;
        DisclaimerV2 disclaimerV2;
        String str2;
        DetailsButton detailsButton;
        String str3;
        char c;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        yw ywVarOnWarmupCompleted = decoder.onWarmupCompleted(serialDescriptor);
        Lazy[] lazyArrOnExtraCallback = ScoreReportResponse.onExtraCallback();
        int i3 = 7;
        int i4 = 6;
        DisclaimerV2 disclaimerV22 = null;
        if (ywVarOnWarmupCompleted.extraCallbackWithResult()) {
            int i5 = IAuthTabCallbackDefault + 85;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            String strAsInterface = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
            List list2 = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), (Object) null);
            String str4 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, (Object) null);
            ScoreReasonAnalysisInfo scoreReasonAnalysisInfo2 = (ScoreReasonAnalysisInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ScoreReasonAnalysisInfo$$serializer.INSTANCE, (Object) null);
            ScoreStatusBoardInfo scoreStatusBoardInfo2 = (ScoreStatusBoardInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ScoreStatusBoardInfo$$serializer.INSTANCE, (Object) null);
            String strAsInterface2 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
            DisclaimerV2 disclaimerV23 = (DisclaimerV2) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 6, DisclaimerV2$$serializer.INSTANCE, (Object) null);
            DetailsButton detailsButton2 = (DetailsButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 7, DetailsButton$.serializer.INSTANCE, (Object) null);
            int i7 = IAuthTabCallbackStub + 111;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 / 5;
            }
            disclaimerV2 = disclaimerV23;
            scoreReasonAnalysisInfo = scoreReasonAnalysisInfo2;
            scoreStatusBoardInfo = scoreStatusBoardInfo2;
            str3 = strAsInterface2;
            list = list2;
            str2 = strAsInterface;
            i = 255;
            detailsButton = detailsButton2;
            str = str4;
        } else {
            i = 0;
            boolean z = true;
            scoreStatusBoardInfo = null;
            ScoreReasonAnalysisInfo scoreReasonAnalysisInfo3 = null;
            String str5 = null;
            list = null;
            String strAsInterface3 = null;
            DetailsButton detailsButton3 = null;
            String strAsInterface4 = null;
            while (z) {
                int i9 = IAuthTabCallbackStub + 51;
                IAuthTabCallbackDefault = i9 % 128;
                if (i9 % 2 != 0) {
                    ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int iOnNavigationEvent = ywVarOnWarmupCompleted.onNavigationEvent(serialDescriptor);
                switch (iOnNavigationEvent) {
                    case -1:
                        int i10 = IAuthTabCallbackStub + 23;
                        IAuthTabCallbackDefault = i10 % 128;
                        int i11 = i10 % 2;
                        i3 = 7;
                        i4 = 6;
                        z = false;
                    case 0:
                        c = 5;
                        strAsInterface3 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 0);
                        i |= 1;
                        i3 = 7;
                    case 1:
                        c = 5;
                        list = (List) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 1, (jp) lazyArrOnExtraCallback[1].getValue(), list);
                        i |= 2;
                        i3 = 7;
                    case 2:
                        c = 5;
                        str5 = (String) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 2, getWriggleLayout.onNavigationEvent, str5);
                        i |= 4;
                        i3 = 7;
                    case 3:
                        c = 5;
                        scoreReasonAnalysisInfo3 = (ScoreReasonAnalysisInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 3, ScoreReasonAnalysisInfo$$serializer.INSTANCE, scoreReasonAnalysisInfo3);
                        i |= 8;
                        i3 = 7;
                    case 4:
                        scoreStatusBoardInfo = (ScoreStatusBoardInfo) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, 4, ScoreStatusBoardInfo$$serializer.INSTANCE, scoreStatusBoardInfo);
                        i |= 16;
                        i3 = 7;
                    case 5:
                        strAsInterface4 = ywVarOnWarmupCompleted.asInterface(serialDescriptor, 5);
                        i |= 32;
                    case 6:
                        disclaimerV22 = (DisclaimerV2) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i4, DisclaimerV2$$serializer.INSTANCE, disclaimerV22);
                        i |= 64;
                    case 7:
                        detailsButton3 = (DetailsButton) ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor, i3, DetailsButton$.serializer.INSTANCE, detailsButton3);
                        i |= 128;
                    default:
                        throw new UnknownFieldException(iOnNavigationEvent);
                }
            }
            scoreReasonAnalysisInfo = scoreReasonAnalysisInfo3;
            str = str5;
            disclaimerV2 = disclaimerV22;
            str2 = strAsInterface3;
            detailsButton = detailsButton3;
            str3 = strAsInterface4;
        }
        ywVarOnWarmupCompleted.onExtraCallbackWithResult(serialDescriptor);
        return new ScoreReportResponse(i, str2, list, str, scoreReasonAnalysisInfo, scoreStatusBoardInfo, str3, disclaimerV2, detailsButton, (okycx) null);
    }

    /* renamed from: deserialize, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m122deserialize(Decoder decoder) throws UnknownFieldException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        ScoreReportResponse scoreReportResponseDeserialize = deserialize(decoder);
        int i4 = IAuthTabCallbackDefault + 15;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return scoreReportResponseDeserialize;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull ScoreReportResponse scoreReportResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(encoder, "");
            Intrinsics.checkNotNullParameter(scoreReportResponse, "");
            SerialDescriptor serialDescriptor = descriptor;
            vyl vylVarOnExtraCallback = encoder.onExtraCallback(serialDescriptor);
            ScoreReportResponse.onExtraCallbackWithResult(scoreReportResponse, vylVarOnExtraCallback, serialDescriptor);
            vylVarOnExtraCallback.onNavigationEvent(serialDescriptor);
            return;
        }
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(scoreReportResponse, "");
        SerialDescriptor serialDescriptor2 = descriptor;
        vyl vylVarOnExtraCallback2 = encoder.onExtraCallback(serialDescriptor2);
        ScoreReportResponse.onExtraCallbackWithResult(scoreReportResponse, vylVarOnExtraCallback2, serialDescriptor2);
        vylVarOnExtraCallback2.onNavigationEvent(serialDescriptor2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        serialize(encoder, (ScoreReportResponse) obj);
        int i4 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            super.typeParametersSerializers();
            throw null;
        }
        KSerializer<?>[] kSerializerArrTypeParametersSerializers = super.typeParametersSerializers();
        int i3 = IAuthTabCallbackDefault + 25;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerArrTypeParametersSerializers;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i3 = $10 + 21;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 101;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 10 - Color.red(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), View.getDefaultSize(0, 0) + 10, 12434 - KeyEvent.getDeadChar(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 16014), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14, TextUtils.getTrimmedLength("") + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = (char) 49936;
        onNavigationEvent = (char) 11357;
        onWarmupCompleted = (char) 50888;
        onExtraCallback = (char) 48013;
    }
}
