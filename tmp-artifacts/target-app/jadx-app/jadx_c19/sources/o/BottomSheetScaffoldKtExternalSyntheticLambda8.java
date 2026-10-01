package o;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.Loader;
import java.util.List;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BottomSheetScaffoldKtExternalSyntheticLambda8 implements Loader.onNavigationEvent {
    public final long IAuthTabCallbackDefault;
    public final long IAuthTabCallbackStub;
    public final int IAuthTabCallbackStubProxy;
    public final Object IAuthTabCallback_Parcel;
    public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 access100;
    public final TextFieldSelectionStateExternalSyntheticLambda12 asBinder;
    public final long asInterface = BadgeKtExternalSyntheticLambda0.onExtraCallback();
    public final int getInterfaceDescriptor;
    public final TextFieldSelectionStateExternalSyntheticLambda6 onTransact;

    public BottomSheetScaffoldKtExternalSyntheticLambda8(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i3, @Nullable Object obj, long j, long j2) {
        this.onTransact = new TextFieldSelectionStateExternalSyntheticLambda6(textFieldSelectionStateExternalSyntheticLambda0);
        this.asBinder = (TextFieldSelectionStateExternalSyntheticLambda12) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionStateExternalSyntheticLambda12);
        this.IAuthTabCallbackStubProxy = i2;
        this.access100 = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        this.getInterfaceDescriptor = i3;
        this.IAuthTabCallback_Parcel = obj;
        this.IAuthTabCallbackStub = j;
        this.IAuthTabCallbackDefault = j2;
    }

    public final long asBinder() {
        return this.IAuthTabCallbackDefault - this.IAuthTabCallbackStub;
    }

    public final long IAuthTabCallbackStub() {
        return this.onTransact.onNavigationEvent();
    }

    public final Uri IAuthTabCallback_Parcel() {
        return this.onTransact.IAuthTabCallback();
    }

    public final Map<String, List<String>> IAuthTabCallbackStubProxy() {
        return this.onTransact.asBinder();
    }
}
