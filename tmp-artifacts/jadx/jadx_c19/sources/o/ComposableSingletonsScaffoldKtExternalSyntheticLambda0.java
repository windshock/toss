package o;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.collect.ImmutableListMultimap;
import java.util.UUID;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda0;
import o.TextFieldStateKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ComposableSingletonsScaffoldKtExternalSyntheticLambda0 {
    public final onNavigationEvent IAuthTabCallback;
    public final String onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final String onNavigationEvent;

    public interface onWarmupCompleted {
        public static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted() { // from class: androidx.media3.exoplayer.upstream.CmcdConfiguration$Factory$$ExternalSyntheticLambda0
            @Override // o.ComposableSingletonsScaffoldKtExternalSyntheticLambda0.onWarmupCompleted
            public final ComposableSingletonsScaffoldKtExternalSyntheticLambda0 createCmcdConfiguration(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
                return ComposableSingletonsScaffoldKtExternalSyntheticLambda0.onWarmupCompleted.onNavigationEvent(textFieldStateKtExternalSyntheticLambda0);
            }
        };

        ComposableSingletonsScaffoldKtExternalSyntheticLambda0 createCmcdConfiguration(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0);

        static /* synthetic */ ComposableSingletonsScaffoldKtExternalSyntheticLambda0 onNavigationEvent(TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
            String string = UUID.randomUUID().toString();
            String str = textFieldStateKtExternalSyntheticLambda0.asInterface;
            if (str == null) {
                str = "";
            }
            return new ComposableSingletonsScaffoldKtExternalSyntheticLambda0(string, str, new onNavigationEvent() { // from class: o.ComposableSingletonsScaffoldKtExternalSyntheticLambda0.onWarmupCompleted.4
            });
        }
    }

    public interface onNavigationEvent {
        default boolean IAuthTabCallback(String str) {
            return true;
        }

        default int onExtraCallbackWithResult(int i2) {
            return -2147483647;
        }

        default ImmutableListMultimap<String, String> onNavigationEvent() {
            return ImmutableListMultimap.of();
        }
    }

    public ComposableSingletonsScaffoldKtExternalSyntheticLambda0(@Nullable String str, @Nullable String str2, onNavigationEvent onnavigationevent) {
        this(str, str2, onnavigationevent, 0);
    }

    public ComposableSingletonsScaffoldKtExternalSyntheticLambda0(@Nullable String str, @Nullable String str2, onNavigationEvent onnavigationevent, int i2) {
        RecordingInputConnection_androidKt.onNavigationEvent(str == null || str.length() <= 64);
        RecordingInputConnection_androidKt.onNavigationEvent(str2 == null || str2.length() <= 64);
        this.onExtraCallback = str;
        this.onNavigationEvent = str2;
        this.IAuthTabCallback = onnavigationevent;
        this.onExtraCallbackWithResult = i2;
    }

    public boolean onExtraCallback() {
        return this.IAuthTabCallback.IAuthTabCallback(TtmlNode.TAG_BR);
    }

    public boolean onExtraCallbackWithResult() {
        return this.IAuthTabCallback.IAuthTabCallback("bl");
    }

    public boolean onNavigationEvent() {
        return this.IAuthTabCallback.IAuthTabCallback("cid");
    }

    public boolean access100() {
        return this.IAuthTabCallback.IAuthTabCallback("sid");
    }

    public boolean asBinder() {
        return this.IAuthTabCallback.IAuthTabCallback("rtp");
    }

    public boolean extraCallbackWithResult() {
        return this.IAuthTabCallback.IAuthTabCallback(RVParams.SHOW_FAVORITES);
    }

    public boolean getInterfaceDescriptor() {
        return this.IAuthTabCallback.IAuthTabCallback(RVParams.SHOW_TITLEBAR);
    }

    public boolean extraCallback() {
        return this.IAuthTabCallback.IAuthTabCallback("tb");
    }

    public boolean onTransact() {
        return this.IAuthTabCallback.IAuthTabCallback("d");
    }

    public boolean IAuthTabCallbackDefault() {
        return this.IAuthTabCallback.IAuthTabCallback("mtp");
    }

    public boolean access000() {
        return this.IAuthTabCallback.IAuthTabCallback("ot");
    }

    public boolean IAuthTabCallback() {
        return this.IAuthTabCallback.IAuthTabCallback("bs");
    }

    public boolean onWarmupCompleted() {
        return this.IAuthTabCallback.IAuthTabCallback("dl");
    }

    public boolean IAuthTabCallback_Parcel() {
        return this.IAuthTabCallback.IAuthTabCallback(RVParams.PULL_REFRESH);
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.IAuthTabCallback.IAuthTabCallback("su");
    }

    public boolean asInterface() {
        return this.IAuthTabCallback.IAuthTabCallback("nor");
    }

    public boolean IAuthTabCallbackStub() {
        return this.IAuthTabCallback.IAuthTabCallback("nrr");
    }
}
