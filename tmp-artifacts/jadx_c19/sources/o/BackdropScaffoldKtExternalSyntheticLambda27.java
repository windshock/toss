package o;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.DrawerStateExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BackdropScaffoldKtExternalSyntheticLambda27 implements BottomNavigationKtExternalSyntheticLambda1 {
    private DrawerKtExternalSyntheticLambda9 onExtraCallback;
    private final DrawerStateExternalSyntheticLambda2 onExtraCallbackWithResult;
    private DrawerStateExternalSyntheticLambda0 onNavigationEvent;

    public BackdropScaffoldKtExternalSyntheticLambda27(DrawerStateExternalSyntheticLambda2 drawerStateExternalSyntheticLambda2) {
        this.onExtraCallbackWithResult = drawerStateExternalSyntheticLambda2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @Override // o.BottomNavigationKtExternalSyntheticLambda1
    public void onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda0 basicTextContextMenuProviderKtExternalSyntheticLambda0, Uri uri, Map<String, List<String>> map, long j, long j2, DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) throws ParserException, IOException {
        DrawerKtExternalSyntheticLambda5 drawerKtExternalSyntheticLambda5 = new DrawerKtExternalSyntheticLambda5(basicTextContextMenuProviderKtExternalSyntheticLambda0, j, j2);
        this.onExtraCallback = drawerKtExternalSyntheticLambda5;
        if (this.onNavigationEvent != null) {
            return;
        }
        DrawerStateExternalSyntheticLambda0[] drawerStateExternalSyntheticLambda0ArrIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback(uri, map);
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(drawerStateExternalSyntheticLambda0ArrIAuthTabCallback.length);
        if (drawerStateExternalSyntheticLambda0ArrIAuthTabCallback.length == 1) {
            this.onNavigationEvent = drawerStateExternalSyntheticLambda0ArrIAuthTabCallback[0];
        } else {
            int length = drawerStateExternalSyntheticLambda0ArrIAuthTabCallback.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0 = drawerStateExternalSyntheticLambda0ArrIAuthTabCallback[i2];
                try {
                } catch (EOFException unused) {
                    if (this.onNavigationEvent != null || drawerKtExternalSyntheticLambda5.IAuthTabCallback() == j) {
                    }
                } catch (Throwable th) {
                    RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent != null || drawerKtExternalSyntheticLambda5.IAuthTabCallback() == j);
                    drawerKtExternalSyntheticLambda5.onExtraCallbackWithResult();
                    throw th;
                }
                if (drawerStateExternalSyntheticLambda0.onExtraCallback(drawerKtExternalSyntheticLambda5)) {
                    this.onNavigationEvent = drawerStateExternalSyntheticLambda0;
                    RecordingInputConnection_androidKt.onExtraCallbackWithResult(true);
                    drawerKtExternalSyntheticLambda5.onExtraCallbackWithResult();
                    break;
                } else {
                    builderBuilderWithExpectedSize.addAll(drawerStateExternalSyntheticLambda0.onExtraCallbackWithResult());
                    boolean z = this.onNavigationEvent != null || drawerKtExternalSyntheticLambda5.IAuthTabCallback() == j;
                    RecordingInputConnection_androidKt.onExtraCallbackWithResult(z);
                    drawerKtExternalSyntheticLambda5.onExtraCallbackWithResult();
                    i2++;
                }
            }
            if (this.onNavigationEvent == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + Joiner.on(", ").join(Lists.transform(ImmutableList.copyOf(drawerStateExternalSyntheticLambda0ArrIAuthTabCallback), new Function() { // from class: androidx.media3.exoplayer.source.BundledExtractorsAdapter$$ExternalSyntheticLambda0
                    public final Object apply(Object obj) {
                        return ((DrawerStateExternalSyntheticLambda0) obj).IAuthTabCallback().getClass().getSimpleName();
                    }
                })) + ") could read the stream.", (Uri) RecordingInputConnection_androidKt.onExtraCallbackWithResult(uri), builderBuilderWithExpectedSize.build());
            }
        }
        this.onNavigationEvent.onNavigationEvent(drawerStateExternalSyntheticLambda1);
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda1
    public void onNavigationEvent() {
        DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0 = this.onNavigationEvent;
        if (drawerStateExternalSyntheticLambda0 != null) {
            drawerStateExternalSyntheticLambda0.onWarmupCompleted();
            this.onNavigationEvent = null;
        }
        this.onExtraCallback = null;
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda1
    public void onExtraCallback() {
        DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0 = this.onNavigationEvent;
        if (drawerStateExternalSyntheticLambda0 != null) {
            DrawerStateExternalSyntheticLambda0 drawerStateExternalSyntheticLambda0IAuthTabCallback = drawerStateExternalSyntheticLambda0.IAuthTabCallback();
            if (drawerStateExternalSyntheticLambda0IAuthTabCallback instanceof OutlinedTextFieldKtExternalSyntheticLambda13) {
                ((OutlinedTextFieldKtExternalSyntheticLambda13) drawerStateExternalSyntheticLambda0IAuthTabCallback).onExtraCallback();
            }
        }
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda1
    public long IAuthTabCallback() {
        DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9 = this.onExtraCallback;
        if (drawerKtExternalSyntheticLambda9 != null) {
            return drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        }
        return -1L;
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda1
    public void onWarmupCompleted(long j, long j2) {
        ((DrawerStateExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).onNavigationEvent(j, j2);
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda1
    public int onExtraCallbackWithResult(ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        return ((DrawerStateExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).onWarmupCompleted((DrawerKtExternalSyntheticLambda9) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback), exposedDropdownMenuDefaultsExternalSyntheticLambda3);
    }
}
