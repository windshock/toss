package ua.naiksoftware.stomp;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AFb1vSDKAFa1ySDK;
import o.access13800;
import o.getTileModeX;
import o.setRubIn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ua.naiksoftware.stomp.dto.StompHeader;
import ua.naiksoftware.stomp.dto.StompMessage;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface StompClient {
    Object addTopic(@NotNull AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK, @Nullable List<? extends StompHeader> list, @NotNull access13800<? super Unit> access13800Var);

    void cancel();

    Object connect(@Nullable List<? extends StompHeader> list, int i, int i2, @NotNull Function1<? super Throwable, Unit> function1, @NotNull access13800<? super Boolean> access13800Var);

    Object disconnect(@Nullable Throwable th, @NotNull access13800<? super Unit> access13800Var);

    getTileModeX<StompMessage> getMessageStream();

    AFb1vSDKAFa1ySDK getSubscriptionKey(@NotNull String str);

    setRubIn<Boolean> isConnected();

    boolean isSubscribed(@NotNull String str);

    Object removeTopic(@NotNull String str, @NotNull access13800<? super Unit> access13800Var);

    void setLegacyWhitespace(boolean z);

    static /* synthetic */ Object connect$default(StompClient stompClient, List list, int i, int i2, Function1 function1, access13800 access13800Var, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
        }
        if ((i3 & 1) != 0) {
            list = null;
        }
        return stompClient.connect(list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, function1, access13800Var);
    }

    static /* synthetic */ Object disconnect$default(StompClient stompClient, Throwable th, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect");
        }
        if ((i & 1) != 0) {
            th = null;
        }
        return stompClient.disconnect(th, access13800Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object addTopic$default(StompClient stompClient, AFb1vSDKAFa1ySDK aFb1vSDKAFa1ySDK, List list, access13800 access13800Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTopic");
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return stompClient.addTopic(aFb1vSDKAFa1ySDK, list, access13800Var);
    }
}
