package viva.republica.toss.network.model.transfer;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.inventory_sdk.model.InventoryAdDto;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TombstoneProtosMemoryMappingBuilder;
import o.htf31;
import o.liq;
import o.okycx;
import o.py;
import o.vyl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.transfer.BridgeModel;
import viva.republica.toss.network.model.transfer.TransferResultData;
import viva.republica.toss.network.model.transfer.TransferResultData$;
import viva.republica.toss.network.model.transfer.TransferResultPage;
import viva.republica.toss.network.model.transfer.TransferSendResponse$;

@liq
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TransferSendResponse {
    public static final int $stable = 0;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final TransferResultPage page;
    private final TransferResultData result;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.onNavigationEvent(TombstoneProtosMemoryMappingBuilder.PUBLICATION, new Function0() { // from class: viva.republica.toss.network.model.transfer.TransferSendResponse$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerOnExtraCallback = TransferSendResponse.onExtraCallback();
            int i4 = IAuthTabCallback + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return kSerializerOnExtraCallback;
            }
            throw null;
        }
    })};

    private static final /* synthetic */ KSerializer IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            TransferResultPage.Companion.serializer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        KSerializer<TransferResultPage> kSerializerSerializer = TransferResultPage.Companion.serializer();
        int i3 = onWarmupCompleted + 61;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return kSerializerSerializer;
    }

    public static /* synthetic */ KSerializer onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        KSerializer kSerializerIAuthTabCallback = IAuthTabCallback();
        int i4 = onWarmupCompleted + 5;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return kSerializerIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferSendResponse)) {
            int i5 = i3 + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        TransferSendResponse transferSendResponse = (TransferSendResponse) obj;
        if (!Intrinsics.areEqual(this.result, transferSendResponse.result)) {
            return false;
        }
        if (Intrinsics.areEqual(this.page, transferSendResponse.page)) {
            int i7 = onWarmupCompleted + 85;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = IAuthTabCallback + 11;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.result.hashCode() * 31) + this.page.hashCode();
        int i4 = onWarmupCompleted + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransferSendResponse(result=" + this.result + ", page=" + this.page + ")";
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ TransferSendResponse(int i, TransferResultData transferResultData, TransferResultPage transferResultPage, okycx okycxVar) {
        SerialDescriptor descriptor;
        int i2 = 3;
        if (3 != (i & 3)) {
            int i3 = onWarmupCompleted + 121;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                descriptor = TransferSendResponse$.serializer.INSTANCE.getDescriptor();
                i2 = 4;
            } else {
                descriptor = TransferSendResponse$.serializer.INSTANCE.getDescriptor();
            }
            htf31.onExtraCallbackWithResult(i, i2, descriptor);
            int i4 = 2 % 2;
        }
        this.result = transferResultData;
        this.page = transferResultPage;
    }

    public TransferSendResponse(@NotNull TransferResultData transferResultData, @NotNull TransferResultPage transferResultPage) {
        Intrinsics.checkNotNullParameter(transferResultData, "");
        Intrinsics.checkNotNullParameter(transferResultPage, "");
        this.result = transferResultData;
        this.page = transferResultPage;
    }

    @JvmStatic
    public static final /* synthetic */ void onExtraCallbackWithResult(TransferSendResponse transferSendResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        py pyVar;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            vylVar.onNavigationEvent(serialDescriptor, 0, TransferResultData$.serializer.INSTANCE, transferSendResponse.result);
            pyVar = (py) lazyArr[0].getValue();
        } else {
            Lazy<KSerializer<Object>>[] lazyArr2 = $childSerializers;
            vylVar.onNavigationEvent(serialDescriptor, 0, TransferResultData$.serializer.INSTANCE, transferSendResponse.result);
            i3 = 1;
            pyVar = (py) lazyArr2[1].getValue();
        }
        vylVar.onNavigationEvent(serialDescriptor, i3, pyVar, transferSendResponse.page);
        int i4 = IAuthTabCallback + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ Lazy[] onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return $childSerializers;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransferResultData onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        TransferResultData transferResultData = this.result;
        int i5 = i3 + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return transferResultData;
    }

    public final TransferResultPage onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.page;
        }
        throw null;
    }

    public static final class Companion {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallbackWithResult = -4684071746886523836L;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferSendResponse> serializer() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            TransferSendResponse$.serializer serializerVar = TransferSendResponse$.serializer.INSTANCE;
            int i4 = onNavigationEvent + 77;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return serializerVar;
            }
            throw null;
        }

        public final TransferSendResponse onWarmupCompleted() throws Throwable {
            int i = 2 % 2;
            TransferResultData transferResultData = new TransferResultData(null, TransferResultData.Status.FAILED);
            Object[] objArr = new Object[1];
            a(new char[]{8475, 38550, 20005, 1968, 65348, 46236, 27706, 9643, 40328, 21790, 2744, 49724, 48086, 29517, 10419, 57464, 22540, 4513, 51506, 48798, 30286, 12283, 59178, 24344, 5252, 52270, 34237, 32081, 13002, 60013, 41890, 7048, 54049, 34979, 16479, 14803, 61809, 42723, 7815, 54859, 36797, 18232, 15580, 62541, 44466, 25981, 56600, 37506, 18983, 927, 64324, 45282, 26741, 8217, 39319, 20858, 1697, 65097, 47046, 28534}, KeyEvent.normalizeMetaState(0) + 46993, objArr);
            TransferResultPage.ImageResource imageResource = new TransferResultPage.ImageResource(((String) objArr[0]).intern(), false);
            Object[] objArr2 = new Object[1];
            a(new char[]{8475, 16630, 58085, 1232, 42692, 51452, 27386, 36043, 11912, 20606, 62072, 5212, 46678, 55341, 31347, 39960, 15884, 40961, 50162, 26046, 34766, 10715, 19434, 60835, 3982, 45464, 54137, 30007, 38732, 14673, 23332, 64818, 8062, 33046, 8963, 17121, 58617, 1749, 43219, 51873, 27817, 36551, 12444, 21114, 62573, 5697, 47183, 55905, 31781, 40499, '\b', 41500, 50602, 26597, 35285, 11227, 19903, 61428, 4510, 45981, 54637, 30574}, 25074 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            TransferResultPage.ImageResource imageResource2 = new TransferResultPage.ImageResource(((String) objArr2[0]).intern(), false);
            TransferResultPage.ButtonLayout.ActionType actionType = TransferResultPage.ButtonLayout.ActionType.ENTER_RECEIVER_REAL_NAME_AND_RERUN;
            Object[] objArr3 = new Object[1];
            a(new char[]{63270, 12726}, 55229 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
            TransferSendResponse transferSendResponse = new TransferSendResponse(transferResultData, new TransferResultPage.Display("송금 실패", "받는 분의 실명과 일치하지 않습니다.\n실명을 확인해주세요", imageResource, imageResource2, (TransferResultPage.MemoLayout) null, (TransferResultPage.PointToast) null, new TransferResultPage.BottomCTALayout(new TransferResultPage.ButtonLayout(((String) objArr3[0]).intern(), (String) null, (String) null, actionType, (String) null, (BridgeModel.Page) null, (BridgeModel.StandardTerms) null, (String) null, (TransferResultPage.AnimatedBoostingBridgePageInfo) null, (InventoryAdDto.Dynamic) null, 1014, (DefaultConstructorMarker) null), new TransferResultPage.ButtonLayout("취소", (String) null, (String) null, TransferResultPage.ButtonLayout.ActionType.CLOSE, (String) null, (BridgeModel.Page) null, (BridgeModel.StandardTerms) null, (String) null, (TransferResultPage.AnimatedBoostingBridgePageInfo) null, (InventoryAdDto.Dynamic) null, 1014, (DefaultConstructorMarker) null), (TransferResultPage.ButtonLayout) null, (String) null, 12, (DefaultConstructorMarker) null), (String) null, (TransferResultPage.ButtonLayout) null, TransferResultPage.HapticType.ERROR, (TransferResultPage.TitleInfo) null, (TransferResultPage.Suggestion) null, (TransferResultPage.LogInfo) null, (TransferResultPage.ListRowBannerLayout) null, (BridgeModel.Page) null, (TransferResultPage.MessageCardInfo) null, (TransferResultPage.SchemeActionInfo) null, (TransferResultPage.SchemeActionInfo) null, false, (String) null, 785840, (DefaultConstructorMarker) null));
            int i2 = onWarmupCompleted + 11;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 88 / 0;
            }
            return transferSendResponse;
        }

        public final TransferSendResponse onNavigationEvent() throws Throwable {
            int i = 2 % 2;
            TransferResultData transferResultData = new TransferResultData(null, TransferResultData.Status.FAILED);
            Object[] objArr = new Object[1];
            a(new char[]{8475, 50940, 61169, 38642, 48876, 42670, 20158, 30337, 7896, 1748, 11996, 54990, 65246, 59055, 36583, 46770, 24236, 18091, 28326, 5884, 16006, 9865, 52942, 63122, 40596, 34436, 44665, 22115, 32354, 26223, 3638, 13922, 56929, 50761, 61003, 38481, 48729, 42577, 20035, 30305, 7725, 1586, 11832, 54847, 65146, 58911, 36364, 46600, 24071, 18005, 28185, 5661, 16366, 10208, 53164, 63481, 40937, 34805, 45012, 22404, 32717, 26575, 4054, 14296}, 59387 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            TransferResultPage.ImageResource imageResource = new TransferResultPage.ImageResource(((String) objArr[0]).intern(), false);
            Object[] objArr2 = new Object[1];
            a(new char[]{8475, 16630, 58085, 1232, 42692, 51452, 27386, 36043, 11912, 20606, 62072, 5212, 46678, 55341, 31347, 39960, 15884, 40961, 50162, 26046, 34766, 10715, 19434, 60835, 3982, 45464, 54137, 30007, 38732, 14673, 23332, 64818, 8062, 33046, 8963, 17121, 58617, 1749, 43219, 51873, 27817, 36551, 12444, 21114, 62573, 5697, 47183, 55905, 31781, 40499, '\b', 41500, 50602, 26597, 35285, 11227, 19903, 61428, 4510, 45981, 54637, 30574}, 25073 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
            TransferSendResponse transferSendResponse = new TransferSendResponse(transferResultData, new TransferResultPage.Display("NH농협은행 점검 시간이에요\n송금을 예약할까요?", "지금은 NH농협은행 점검 시간이에요. (23:55~00:30) 송금을 예약하면 점검이 끝나는 대로 돈을 보내드려요.", imageResource, new TransferResultPage.ImageResource(((String) objArr2[0]).intern(), false), (TransferResultPage.MemoLayout) null, (TransferResultPage.PointToast) null, new TransferResultPage.BottomCTALayout(new TransferResultPage.ButtonLayout("예약하기", (String) null, (String) null, TransferResultPage.ButtonLayout.ActionType.INTRODUCE_SCHEDULED_TRANSFER_WITH_HOLDER_NAME, (String) null, (BridgeModel.Page) null, (BridgeModel.StandardTerms) null, (String) null, (TransferResultPage.AnimatedBoostingBridgePageInfo) null, (InventoryAdDto.Dynamic) null, 1014, (DefaultConstructorMarker) null), new TransferResultPage.ButtonLayout("닫기", (String) null, (String) null, TransferResultPage.ButtonLayout.ActionType.CLOSE, (String) null, (BridgeModel.Page) null, (BridgeModel.StandardTerms) null, (String) null, (TransferResultPage.AnimatedBoostingBridgePageInfo) null, (InventoryAdDto.Dynamic) null, 1014, (DefaultConstructorMarker) null), (TransferResultPage.ButtonLayout) null, (String) null, 12, (DefaultConstructorMarker) null), (String) null, (TransferResultPage.ButtonLayout) null, TransferResultPage.HapticType.WIGGLE, (TransferResultPage.TitleInfo) null, (TransferResultPage.Suggestion) null, (TransferResultPage.LogInfo) null, (TransferResultPage.ListRowBannerLayout) null, (BridgeModel.Page) null, (TransferResultPage.MessageCardInfo) null, (TransferResultPage.SchemeActionInfo) null, (TransferResultPage.SchemeActionInfo) null, true, (String) null, 785840, (DefaultConstructorMarker) null));
            int i2 = onWarmupCompleted + 53;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return transferSendResponse;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 17;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ImageFormat.getBitsPerPixel(0) + 25, 19627 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                    Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 58, (ViewConfiguration.getWindowTouchSlop() >> 8) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", ""), (ViewConfiguration.getLongPressTimeout() >> 16) + 59, 6384 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            String str = new String(cArr2);
            int i6 = $11 + 49;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }
    }

    static {
        int i = onExtraCallback + 73;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }
}
