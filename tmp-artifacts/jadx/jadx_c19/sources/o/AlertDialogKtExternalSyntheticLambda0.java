package o;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.RippleKtExternalSyntheticLambda0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AlertDialogKtExternalSyntheticLambda0 implements DrawerStateExternalSyntheticLambda0 {
    private DrawerStateExternalSyntheticLambda1 IAuthTabCallback;
    private final RippleKtExternalSyntheticLambda0.onExtraCallback IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda24 asBinder;
    private final boolean onExtraCallback;
    private final String onExtraCallbackWithResult;
    private static final Pattern onWarmupCompleted = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern onNavigationEvent = Pattern.compile("MPEGTS:(-?\\d+)");
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 asInterface = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private byte[] onTransact = new byte[1024];

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public AlertDialogKtExternalSyntheticLambda0(@Nullable String str, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback, boolean z) {
        this.onExtraCallbackWithResult = str;
        this.asBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda24;
        this.IAuthTabCallbackDefault = onextracallback;
        this.onExtraCallback = z;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(this.onTransact, 0, 6, false);
        this.asInterface.onExtraCallback(this.onTransact, 6);
        if (SliderKtExternalSyntheticLambda12.onExtraCallback(this.asInterface)) {
            return true;
        }
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult(this.onTransact, 6, 3, false);
        this.asInterface.onExtraCallback(this.onTransact, 9);
        return SliderKtExternalSyntheticLambda12.onExtraCallback(this.asInterface);
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        if (this.onExtraCallback) {
            drawerStateExternalSyntheticLambda1 = new ResistanceConfig(drawerStateExternalSyntheticLambda1, this.IAuthTabCallbackDefault);
        }
        this.IAuthTabCallback = drawerStateExternalSyntheticLambda1;
        drawerStateExternalSyntheticLambda1.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L));
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        int iOnExtraCallback = (int) drawerKtExternalSyntheticLambda9.onExtraCallback();
        int i2 = this.IAuthTabCallbackStub;
        byte[] bArr = this.onTransact;
        if (i2 == bArr.length) {
            this.onTransact = Arrays.copyOf(bArr, ((iOnExtraCallback != -1 ? iOnExtraCallback : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.onTransact;
        int i3 = this.IAuthTabCallbackStub;
        int iOnWarmupCompleted = drawerKtExternalSyntheticLambda9.onWarmupCompleted(bArr2, i3, bArr2.length - i3);
        if (iOnWarmupCompleted != -1) {
            int i4 = this.IAuthTabCallbackStub + iOnWarmupCompleted;
            this.IAuthTabCallbackStub = i4;
            if (iOnExtraCallback == -1 || i4 != iOnExtraCallback) {
                return 0;
            }
        }
        onNavigationEvent();
        return -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @RequiresNonNull
    private void onNavigationEvent() throws ParserException {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(this.onTransact);
        SliderKtExternalSyntheticLambda12.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        long jOnNavigationEvent = 0;
        long jOnNavigationEvent2 = 0;
        for (String strAccess000 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000(); !TextUtils.isEmpty(strAccess000); strAccess000 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access000()) {
            if (strAccess000.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = onWarmupCompleted.matcher(strAccess000);
                if (!matcher.find()) {
                    throw ParserException.onNavigationEvent("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strAccess000, (Throwable) null);
                }
                Matcher matcher2 = onNavigationEvent.matcher(strAccess000);
                if (!matcher2.find()) {
                    throw ParserException.onNavigationEvent("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strAccess000, (Throwable) null);
                }
                jOnNavigationEvent2 = SliderKtExternalSyntheticLambda12.onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1)));
                jOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda24.onNavigationEvent(Long.parseLong((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher2.group(1))));
            }
        }
        Matcher matcherOnWarmupCompleted = SliderKtExternalSyntheticLambda12.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        if (matcherOnWarmupCompleted == null) {
            IAuthTabCallback(0L);
            return;
        }
        long jOnNavigationEvent3 = SliderKtExternalSyntheticLambda12.onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcherOnWarmupCompleted.group(1)));
        long jIAuthTabCallback = this.asBinder.IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda24.onWarmupCompleted((jOnNavigationEvent + jOnNavigationEvent3) - jOnNavigationEvent2));
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5IAuthTabCallback = IAuthTabCallback(jIAuthTabCallback - jOnNavigationEvent3);
        this.asInterface.onExtraCallback(this.onTransact, this.IAuthTabCallbackStub);
        exposedDropdownMenu_androidKtExternalSyntheticLambda5IAuthTabCallback.onNavigationEvent(this.asInterface, this.IAuthTabCallbackStub);
        exposedDropdownMenu_androidKtExternalSyntheticLambda5IAuthTabCallback.onExtraCallback(jIAuthTabCallback, 1, this.IAuthTabCallbackStub, 0, null);
    }

    @RequiresNonNull
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 IAuthTabCallback(long j) {
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(0, 3);
        exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("text/vtt").onWarmupCompleted(this.onExtraCallbackWithResult).onExtraCallback(j).onNavigationEvent());
        this.IAuthTabCallback.onExtraCallbackWithResult();
        return exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
    }
}
