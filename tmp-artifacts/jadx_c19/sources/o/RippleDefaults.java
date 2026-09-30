package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.RadioButtonDefaults;
import o.RippleDefaults;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class RippleDefaults implements DrawerStateExternalSyntheticLambda0 {
    private int IAuthTabCallbackStub;
    private long[] asBinder;
    private final RippleKtExternalSyntheticLambda0 asInterface;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 getInterfaceDescriptor;
    private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult;
    private int onNavigationEvent;
    private long onTransact;
    private final List<onExtraCallbackWithResult> onWarmupCompleted;
    private final ProgressIndicatorKtExternalSyntheticLambda8 onExtraCallback = new ProgressIndicatorKtExternalSyntheticLambda8();
    private byte[] IAuthTabCallbackDefault = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        return true;
    }

    public RippleDefaults(RippleKtExternalSyntheticLambda0 rippleKtExternalSyntheticLambda0, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        this.asInterface = rippleKtExternalSyntheticLambda0;
        this.onExtraCallbackWithResult = basicTextContextMenuProviderKtExternalSyntheticLambda4 != null ? basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().IAuthTabCallbackDefault("application/x-media3-cues").onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable).IAuthTabCallbackStub(rippleKtExternalSyntheticLambda0.onExtraCallback()).onNavigationEvent() : null;
        this.onWarmupCompleted = new ArrayList();
        this.IAuthTabCallbackStub = 0;
        this.asBinder = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback;
        this.onTransact = -9223372036854775807L;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub == 0);
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(0, 3);
        this.getInterfaceDescriptor = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onExtraCallbackWithResult;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4 != null) {
            exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult();
            drawerStateExternalSyntheticLambda1.IAuthTabCallback(new ExposedDropdownMenu_androidExternalSyntheticLambda1(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.IAuthTabCallbackStub = 1;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        int i2 = this.IAuthTabCallbackStub;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult((i2 == 0 || i2 == 5) ? false : true);
        if (this.IAuthTabCallbackStub == 1) {
            int iCheckedCast = drawerKtExternalSyntheticLambda9.onExtraCallback() != -1 ? Ints.checkedCast(drawerKtExternalSyntheticLambda9.onExtraCallback()) : 1024;
            if (iCheckedCast > this.IAuthTabCallbackDefault.length) {
                this.IAuthTabCallbackDefault = new byte[iCheckedCast];
            }
            this.onNavigationEvent = 0;
            this.IAuthTabCallbackStub = 2;
        }
        if (this.IAuthTabCallbackStub == 2 && onWarmupCompleted(drawerKtExternalSyntheticLambda9)) {
            onNavigationEvent();
            this.IAuthTabCallbackStub = 4;
        }
        if (this.IAuthTabCallbackStub == 3 && onNavigationEvent(drawerKtExternalSyntheticLambda9)) {
            onExtraCallback();
            this.IAuthTabCallbackStub = 4;
        }
        return this.IAuthTabCallbackStub == 4 ? -1 : 0;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        int i2 = this.IAuthTabCallbackStub;
        RecordingInputConnection_androidKt.onExtraCallbackWithResult((i2 == 0 || i2 == 5) ? false : true);
        this.onTransact = j2;
        if (this.IAuthTabCallbackStub == 2) {
            this.IAuthTabCallbackStub = 1;
        }
        if (this.IAuthTabCallbackStub == 4) {
            this.IAuthTabCallbackStub = 3;
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
        if (this.IAuthTabCallbackStub == 5) {
            return;
        }
        this.asInterface.onNavigationEvent();
        this.IAuthTabCallbackStub = 5;
    }

    private boolean onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        return drawerKtExternalSyntheticLambda9.onWarmupCompleted((drawerKtExternalSyntheticLambda9.onExtraCallback() > (-1L) ? 1 : (drawerKtExternalSyntheticLambda9.onExtraCallback() == (-1L) ? 0 : -1)) != 0 ? Ints.checkedCast(drawerKtExternalSyntheticLambda9.onExtraCallback()) : 1024) == -1;
    }

    private boolean onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        byte[] bArr = this.IAuthTabCallbackDefault;
        if (bArr.length == this.onNavigationEvent) {
            this.IAuthTabCallbackDefault = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.IAuthTabCallbackDefault;
        int i2 = this.onNavigationEvent;
        int iOnWarmupCompleted = drawerKtExternalSyntheticLambda9.onWarmupCompleted(bArr2, i2, bArr2.length - i2);
        if (iOnWarmupCompleted != -1) {
            this.onNavigationEvent += iOnWarmupCompleted;
        }
        long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
        return (jOnExtraCallback != -1 && ((long) this.onNavigationEvent) == jOnExtraCallback) || iOnWarmupCompleted == -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private void onNavigationEvent() throws ParserException, IOException {
        RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationeventOnWarmupCompleted;
        try {
            long j = this.onTransact;
            if (j != -9223372036854775807L) {
                onnavigationeventOnWarmupCompleted = RippleKtExternalSyntheticLambda0.onNavigationEvent.onExtraCallback(j);
            } else {
                onnavigationeventOnWarmupCompleted = RippleKtExternalSyntheticLambda0.onNavigationEvent.onWarmupCompleted();
            }
            this.asInterface.IAuthTabCallback(this.IAuthTabCallbackDefault, 0, this.onNavigationEvent, onnavigationeventOnWarmupCompleted, new TextFieldDecoratorModifierNodeExternalSyntheticLambda10() { // from class: androidx.media3.extractor.text.SubtitleExtractor$$ExternalSyntheticLambda0
                public final void accept(Object obj) {
                    RippleDefaults.onNavigationEvent(this.f$0, (RadioButtonDefaults) obj);
                }
            });
            Collections.sort(this.onWarmupCompleted);
            this.asBinder = new long[this.onWarmupCompleted.size()];
            for (int i2 = 0; i2 < this.onWarmupCompleted.size(); i2++) {
                this.asBinder[i2] = this.onWarmupCompleted.get(i2).onExtraCallbackWithResult;
            }
            this.IAuthTabCallbackDefault = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
        } catch (RuntimeException e) {
            throw ParserException.onNavigationEvent("SubtitleParser failed.", e);
        }
    }

    public static /* synthetic */ void onNavigationEvent(RippleDefaults rippleDefaults, RadioButtonDefaults radioButtonDefaults) {
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(radioButtonDefaults.onExtraCallback, rippleDefaults.onExtraCallback.onWarmupCompleted(radioButtonDefaults.onNavigationEvent, radioButtonDefaults.onExtraCallbackWithResult));
        rippleDefaults.onWarmupCompleted.add(onextracallbackwithresult);
        long j = rippleDefaults.onTransact;
        if (j == -9223372036854775807L || radioButtonDefaults.IAuthTabCallback >= j) {
            rippleDefaults.onNavigationEvent(onextracallbackwithresult);
        }
    }

    private void onExtraCallback() {
        long j = this.onTransact;
        for (int iOnExtraCallback = j == -9223372036854775807L ? 0 : TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.asBinder, j, true, true); iOnExtraCallback < this.onWarmupCompleted.size(); iOnExtraCallback++) {
            onNavigationEvent(this.onWarmupCompleted.get(iOnExtraCallback));
        }
    }

    private void onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.getInterfaceDescriptor);
        int length = onextracallbackwithresult.onExtraCallback.length;
        this.IAuthTabCallback.onWarmupCompleted(onextracallbackwithresult.onExtraCallback);
        this.getInterfaceDescriptor.onNavigationEvent(this.IAuthTabCallback, length);
        this.getInterfaceDescriptor.onExtraCallback(onextracallbackwithresult.onExtraCallbackWithResult, 1, length, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class onExtraCallbackWithResult implements Comparable<onExtraCallbackWithResult> {
        private final byte[] onExtraCallback;
        private final long onExtraCallbackWithResult;

        private onExtraCallbackWithResult(long j, byte[] bArr) {
            this.onExtraCallbackWithResult = j;
            this.onExtraCallback = bArr;
        }

        @Override // java.lang.Comparable
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public int compareTo(onExtraCallbackWithResult onextracallbackwithresult) {
            return Long.compare(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult);
        }
    }
}
