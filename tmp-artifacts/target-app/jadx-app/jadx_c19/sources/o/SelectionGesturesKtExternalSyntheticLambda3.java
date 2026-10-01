package o;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import o.AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.SelectionContainerKtExternalSyntheticLambda9;
import o.SelectionContainerKtExternalSyntheticLambda9$onWarmupCompleted;
import o.SelectionGesturesKtExternalSyntheticLambda3;
import o.SelectionManagerExternalSyntheticLambda2;
import o.TextContextMenuProviderKtExternalSyntheticLambda0;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda19;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SelectionGesturesKtExternalSyntheticLambda3 implements SelectionContainerKtExternalSyntheticLambda8 {
    private final SparseArray<SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent> IAuthTabCallback;
    private AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 IAuthTabCallbackStub;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback asBinder;
    private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback asInterface;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda0 onExtraCallback;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda16 onExtraCallbackWithResult;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda19<SelectionContainerKtExternalSyntheticLambda9> onNavigationEvent;
    private final onNavigationEvent onTransact;
    private boolean onWarmupCompleted;

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, int i3, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, int i3, boolean z, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, long j, int i2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, Exception exc, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, boolean z, int i2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, boolean z, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void IAuthTabCallbackStub(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, boolean z, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, long j, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, Exception exc, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, String str, long j, long j2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, int i2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda12, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, TextFieldBufferExternalSyntheticLambda0 textFieldBufferExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, boolean z, int i2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, boolean z, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, long j, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, String str, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, TextFieldBufferExternalSyntheticLambda0 textFieldBufferExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, createInputConnection createinputconnection, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, long j, long j2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, long j, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, Exception exc, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, Object obj, long j, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, String str, long j, long j2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, String str, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, BasicTextContextMenuProviderKtExternalSyntheticLambda2 basicTextContextMenuProviderKtExternalSyntheticLambda2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9, TextContextMenuProviderKtExternalSyntheticLambda0 textContextMenuProviderKtExternalSyntheticLambda0) {
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, float f, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, long j, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, Exception exc, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, List list, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, ImeEditCommand_androidKtExternalSyntheticLambda2 imeEditCommand_androidKtExternalSyntheticLambda2, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, boolean z, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
    }

    public void onExtraCallback() {
    }

    public void onExtraCallback(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult) {
    }

    public void onNavigationEvent(boolean z) {
    }

    public SelectionGesturesKtExternalSyntheticLambda3(TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.onExtraCallback = (TextFieldDecoratorModifierNodeExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda0);
        this.onNavigationEvent = new TextFieldDecoratorModifierNodeExternalSyntheticLambda19<>(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda0, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onExtraCallback() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda39
            public final void invoke(Object obj, TextContextMenuProviderKtExternalSyntheticLambda0 textContextMenuProviderKtExternalSyntheticLambda0) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent((SelectionContainerKtExternalSyntheticLambda9) obj, textContextMenuProviderKtExternalSyntheticLambda0);
            }
        });
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback();
        this.asInterface = onextracallback;
        this.asBinder = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback();
        this.onTransact = new onNavigationEvent(onextracallback);
        this.IAuthTabCallback = new SparseArray<>();
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public void onNavigationEvent(SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
        this.onNavigationEvent.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9);
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public void onExtraCallback(SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
        this.onNavigationEvent.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9);
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public void onWarmupCompleted(final AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, Looper looper) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub == null || this.onTransact.onExtraCallbackWithResult.isEmpty());
        this.IAuthTabCallbackStub = (AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0);
        this.onExtraCallbackWithResult = this.onExtraCallback.onWarmupCompleted(looper, (Handler.Callback) null);
        this.onNavigationEvent = this.onNavigationEvent.onExtraCallbackWithResult(looper, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onExtraCallback() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda24
            public final void invoke(Object obj, TextContextMenuProviderKtExternalSyntheticLambda0 textContextMenuProviderKtExternalSyntheticLambda0) {
                SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9 = (SelectionContainerKtExternalSyntheticLambda9) obj;
                selectionContainerKtExternalSyntheticLambda9.IAuthTabCallback(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, new SelectionContainerKtExternalSyntheticLambda9$onWarmupCompleted(textContextMenuProviderKtExternalSyntheticLambda0, this.f$0.IAuthTabCallback));
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public void onNavigationEvent() {
        ((TextFieldDecoratorModifierNodeExternalSyntheticLambda16) RecordingInputConnection_androidKt.onWarmupCompleted(this.onExtraCallbackWithResult)).onNavigationEvent(new Runnable() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda60
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.IAuthTabCallbackStub();
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onExtraCallback(List<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> list, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        this.onTransact.onNavigationEvent(list, onextracallbackwithresult, (AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub));
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onWarmupCompleted() {
        if (this.onWarmupCompleted) {
            return;
        }
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        this.onWarmupCompleted = true;
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, -1, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda56
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public void onNavigationEvent(final int i2, final int i3, final boolean z) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1033, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda37
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, i2, i3, z, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onNavigationEvent(final TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1007, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda12
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, textStringSimpleNodeExternalSyntheticLambda1, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void IAuthTabCallback(final String str, final long j, final long j2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1008, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda30
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, str, j2, j, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onExtraCallbackWithResult(final BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable final TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1009, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda57
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, basicTextContextMenuProviderKtExternalSyntheticLambda4, textStringSimpleNodeExternalSyntheticLambda0, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onExtraCallbackWithResult(final long j) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1010, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda28
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, j, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onExtraCallback(final int i2, final long j, final long j2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1011, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda22
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, i2, j, j2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void IAuthTabCallback(final String str) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1012, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda15
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, str, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onExtraCallback(final TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder = asBinder();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder, 1013, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda43
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder, textStringSimpleNodeExternalSyntheticLambda1, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onNavigationEvent(final Exception exc) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1014, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda69
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, exc, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onExtraCallbackWithResult(final Exception exc) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1029, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda64
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, exc, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public void onExtraCallbackWithResult(final SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1031, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda51
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, iAuthTabCallback, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public void IAuthTabCallback(final SelectionManagerExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1032, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda67
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, iAuthTabCallback, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onNavigationEvent(final float f) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 22, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda20
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, f, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onWarmupCompleted(final TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1015, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda59
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, textStringSimpleNodeExternalSyntheticLambda1, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onWarmupCompleted(final String str, final long j, final long j2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1016, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda65
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, str, j2, j, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onNavigationEvent(final BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable final TextStringSimpleNodeExternalSyntheticLambda0 textStringSimpleNodeExternalSyntheticLambda0) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1017, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda50
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, basicTextContextMenuProviderKtExternalSyntheticLambda4, textStringSimpleNodeExternalSyntheticLambda0, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onNavigationEvent(final int i2, final long j) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder = asBinder();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder, 1018, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda33
            public final void invoke(Object obj) {
                ((SelectionContainerKtExternalSyntheticLambda9) obj).onDroppedVideoFrames(selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder, i2, j);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onExtraCallback(final String str) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1019, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda32
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, str, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onExtraCallbackWithResult(final TextStringSimpleNodeExternalSyntheticLambda1 textStringSimpleNodeExternalSyntheticLambda1) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder = asBinder();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder, 1020, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda4
            public final void invoke(Object obj) {
                ((SelectionContainerKtExternalSyntheticLambda9) obj).onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder, textStringSimpleNodeExternalSyntheticLambda1);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onExtraCallback(final Object obj, final long j) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 26, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda62
            public final void invoke(Object obj2) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, obj, j, (SelectionContainerKtExternalSyntheticLambda9) obj2);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void IAuthTabCallback(final long j, final int i2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder = asBinder();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder, 1021, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda40
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventAsBinder, j, i2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.SelectionContainerKtExternalSyntheticLambda8
    public final void onWarmupCompleted(final Exception exc) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 1030, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda21
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, exc, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallback(final int i2, final int i3) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 24, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda71
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, i2, i3, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void IAuthTabCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, final int i3) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1000, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda8
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2, i3, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1001, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda49
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1002, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda41
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2, final IOException iOException, final boolean z) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1003, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda23
            public final void invoke(Object obj) {
                ((SelectionContainerKtExternalSyntheticLambda9) obj).onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, badgeKtExternalSyntheticLambda0, badgeKtExternalSyntheticLambda2, iOException, z);
            }
        });
    }

    public final void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1005, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda63
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, badgeKtExternalSyntheticLambda2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final BadgeKtExternalSyntheticLambda2 badgeKtExternalSyntheticLambda2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1004, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda3
            public final void invoke(Object obj) {
                ((SelectionContainerKtExternalSyntheticLambda9) obj).onDownstreamFormatChanged(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, badgeKtExternalSyntheticLambda2);
            }
        });
    }

    public final void IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, final int i2) {
        this.onTransact.onWarmupCompleted((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub));
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 0, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda17
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, i2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void IAuthTabCallback(@Nullable final TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0, final int i2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 1, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda18
            public final void invoke(Object obj) {
                ((SelectionContainerKtExternalSyntheticLambda9) obj).onMediaItemTransition(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, textFieldStateKtExternalSyntheticLambda0, i2);
            }
        });
    }

    public void onNavigationEvent(final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda12 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda12) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 2, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda2
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda12, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallback(final boolean z) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 3, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda14
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, z, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void onExtraCallback(final AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onWarmupCompleted onwarmupcompleted) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 13, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda16
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, onwarmupcompleted, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallbackWithResult(final boolean z, final int i2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, -1, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda25
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, z, i2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallback(final int i2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 4, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda44
            public final void invoke(Object obj) {
                ((SelectionContainerKtExternalSyntheticLambda9) obj).onPlaybackStateChanged(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, i2);
            }
        });
    }

    public final void onNavigationEvent(final boolean z, final int i2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 5, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda36
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, z, i2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onWarmupCompleted(final int i2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 6, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda31
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, i2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void onWarmupCompleted(final boolean z) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 7, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda29
            public final void invoke(Object obj) {
                ((SelectionContainerKtExternalSyntheticLambda9) obj).onIsPlayingChanged(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, z);
            }
        });
    }

    public final void IAuthTabCallback(final int i2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 8, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda61
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallbackDefault(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, i2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void IAuthTabCallback(final boolean z) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 9, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda70
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, z, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallbackWithResult(final createInputConnection createinputconnection) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallback = onExtraCallback(createinputconnection);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallback, 10, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda42
            public final void invoke(Object obj) {
                ((SelectionContainerKtExternalSyntheticLambda9) obj).onPlayerError(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallback, createinputconnection);
            }
        });
    }

    public void IAuthTabCallback(@Nullable final createInputConnection createinputconnection) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallback = onExtraCallback(createinputconnection);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallback, 10, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda34
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallback, createinputconnection, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void IAuthTabCallback(final AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onNavigationEvent onnavigationevent, final AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.onNavigationEvent onnavigationevent2, final int i2) {
        if (i2 == 1) {
            this.onWarmupCompleted = false;
        }
        this.onTransact.IAuthTabCallback((AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallbackStub));
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 11, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda58
            public final void invoke(Object obj) {
                SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9 = (SelectionContainerKtExternalSyntheticLambda9) obj;
                selectionContainerKtExternalSyntheticLambda9.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, onnavigationevent, onnavigationevent2, i2);
            }
        });
    }

    public final void onNavigationEvent(final AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 12, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda0
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void onExtraCallback(final long j) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 16, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda7
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, j, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void onWarmupCompleted(final long j) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 17, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda13
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, j, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void onNavigationEvent(final long j) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 18, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda9
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, j, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void onWarmupCompleted(final TextFieldBufferExternalSyntheticLambda0 textFieldBufferExternalSyntheticLambda0) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 14, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda6
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, textFieldBufferExternalSyntheticLambda0, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void onNavigationEvent(final TextFieldBufferExternalSyntheticLambda0 textFieldBufferExternalSyntheticLambda0) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 15, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda54
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, textFieldBufferExternalSyntheticLambda0, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void IAuthTabCallback(final HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 28, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda27
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, handwritingHandlerNodeExternalSyntheticLambda0, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void onWarmupCompleted(final List<ImeEditCommand_androidKtExternalSyntheticLambda1> list) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 27, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda38
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, list, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void onExtraCallback(final ImeEditCommand_androidKtExternalSyntheticLambda2 imeEditCommand_androidKtExternalSyntheticLambda2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 27, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda5
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, imeEditCommand_androidKtExternalSyntheticLambda2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallbackWithResult(final boolean z) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 23, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda19
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, z, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onNavigationEvent(final int i2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 21, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda53
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, i2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onWarmupCompleted(final TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 20, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda26
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, textContextMenuHelperApi28ExternalSyntheticLambda5, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallbackWithResult(final CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, 25, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda55
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onWarmupCompleted(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallbackDefault, cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public static /* synthetic */ void onWarmupCompleted(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, CursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0 cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0, SelectionContainerKtExternalSyntheticLambda9 selectionContainerKtExternalSyntheticLambda9) {
        selectionContainerKtExternalSyntheticLambda9.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0);
        int i2 = cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onWarmupCompleted;
        int i3 = cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.IAuthTabCallback;
        float f = cursorAnchorInfoControllerstartOrStopMonitoring1ExternalSyntheticLambda0.onNavigationEvent;
    }

    public void onExtraCallbackWithResult(final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 19, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda10
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void IAuthTabCallback(final BasicTextContextMenuProviderKtExternalSyntheticLambda2 basicTextContextMenuProviderKtExternalSyntheticLambda2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 29, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda46
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onNavigationEvent(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, basicTextContextMenuProviderKtExternalSyntheticLambda2, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public void onNavigationEvent(final int i2, final boolean z) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 30, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda35
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, i2, z, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    @Override // o.ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2.IAuthTabCallback
    public final void onExtraCallbackWithResult(final int i2, final long j, final long j2) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1006, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda1
            public final void invoke(Object obj) {
                ((SelectionContainerKtExternalSyntheticLambda9) obj).onBandwidthEstimate(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, i2, j, j2);
            }
        });
    }

    public final void IAuthTabCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final int i3) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1022, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda45
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, i3, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onWarmupCompleted(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1023, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda66
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, final Exception exc) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1024, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda48
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, exc, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void IAuthTabCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1025, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda52
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallbackStub(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onNavigationEvent(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1026, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda47
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.IAuthTabCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    public final void onExtraCallback(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult = onExtraCallbackWithResult(i2, onextracallbackwithresult);
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, 1027, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda68
            public final void invoke(Object obj) {
                SelectionGesturesKtExternalSyntheticLambda3.onExtraCallback(selectionContainerKtExternalSyntheticLambda9$onNavigationEventOnExtraCallbackWithResult, (SelectionContainerKtExternalSyntheticLambda9) obj);
            }
        });
    }

    protected final void onExtraCallbackWithResult(SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEvent, int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent<SelectionContainerKtExternalSyntheticLambda9> onnavigationevent) {
        this.IAuthTabCallback.put(i2, selectionContainerKtExternalSyntheticLambda9$onNavigationEvent);
        this.onNavigationEvent.IAuthTabCallback(i2, onnavigationevent);
    }

    protected final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent IAuthTabCallback() {
        return onExtraCallback(this.onTransact.onExtraCallback());
    }

    @RequiresNonNull
    protected final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback() ? null : onextracallbackwithresult;
        long jIAuthTabCallback = this.onExtraCallback.IAuthTabCallback();
        boolean z = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.equals(this.IAuthTabCallbackStub.newSession()) && i2 == this.IAuthTabCallbackStub.isEngagementSignalsApiAvailable();
        long jOnNavigationEvent = 0;
        if (onextracallbackwithresult2 == null || !onextracallbackwithresult2.IAuthTabCallback()) {
            if (z) {
                jOnNavigationEvent = this.IAuthTabCallbackStub.ICustomTabsCallbackStubProxy();
            } else if (!coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback()) {
                jOnNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(i2, this.asBinder).onNavigationEvent();
            }
        } else if (z && this.IAuthTabCallbackStub.ICustomTabsCallbackDefault() == onextracallbackwithresult2.onWarmupCompleted && this.IAuthTabCallbackStub.extraCommand() == onextracallbackwithresult2.IAuthTabCallback) {
            jOnNavigationEvent = this.IAuthTabCallbackStub.ICustomTabsCallback_Parcel();
        }
        return new SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent(jIAuthTabCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, i2, onextracallbackwithresult2, jOnNavigationEvent, this.IAuthTabCallbackStub.newSession(), this.IAuthTabCallbackStub.isEngagementSignalsApiAvailable(), this.onTransact.onExtraCallback(), this.IAuthTabCallbackStub.ICustomTabsCallback_Parcel(), this.IAuthTabCallbackStub.access200());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallbackStub() {
        final SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback = IAuthTabCallback();
        onExtraCallbackWithResult(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback, 1028, new TextFieldDecoratorModifierNodeExternalSyntheticLambda19.onNavigationEvent() { // from class: androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda11
            public final void invoke(Object obj) {
                ((SelectionContainerKtExternalSyntheticLambda9) obj).onPlayerReleased(selectionContainerKtExternalSyntheticLambda9$onNavigationEventIAuthTabCallback);
            }
        });
        this.onNavigationEvent.onNavigationEvent();
    }

    private SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent onExtraCallback(@Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult = onextracallbackwithresult == null ? null : this.onTransact.onExtraCallbackWithResult(onextracallbackwithresult);
        if (onextracallbackwithresult == null || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult == null) {
            int iIsEngagementSignalsApiAvailable = this.IAuthTabCallbackStub.isEngagementSignalsApiAvailable();
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = this.IAuthTabCallbackStub.newSession();
            if (iIsEngagementSignalsApiAvailable >= coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallbackWithResult()) {
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted;
            }
            return onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession, iIsEngagementSignalsApiAvailable, (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) null);
        }
        return onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10OnExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallback, this.asInterface).IAuthTabCallbackStub, onextracallbackwithresult);
    }

    private SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent asBinder() {
        return onExtraCallback(this.onTransact.onExtraCallbackWithResult());
    }

    private SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent IAuthTabCallbackDefault() {
        return onExtraCallback(this.onTransact.IAuthTabCallback());
    }

    private SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent onExtraCallbackWithResult() {
        return onExtraCallback(this.onTransact.onWarmupCompleted());
    }

    private SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent onExtraCallbackWithResult(int i2, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
        AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 = this.IAuthTabCallbackStub;
        if (onextracallbackwithresult != null) {
            if (this.onTransact.onExtraCallbackWithResult(onextracallbackwithresult) != null) {
                return onExtraCallback(onextracallbackwithresult);
            }
            return onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted, i2, onextracallbackwithresult);
        }
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.newSession();
        if (i2 >= coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallbackWithResult()) {
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted;
        }
        return onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession, i2, (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) null);
    }

    private SelectionContainerKtExternalSyntheticLambda9$onNavigationEvent onExtraCallback(@Nullable createInputConnection createinputconnection) {
        BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult;
        if ((createinputconnection instanceof AndroidSelectionHandles_androidKtExternalSyntheticLambda4) && (onextracallbackwithresult = ((AndroidSelectionHandles_androidKtExternalSyntheticLambda4) createinputconnection).mediaPeriodId) != null) {
            return onExtraCallback(onextracallbackwithresult);
        }
        return IAuthTabCallback();
    }

    static final class onNavigationEvent {
        private BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallback;
        private final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onNavigationEvent;
        private BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onTransact;
        private BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onWarmupCompleted;
        private ImmutableList<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> onExtraCallbackWithResult = ImmutableList.of();
        private ImmutableMap<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10> IAuthTabCallback = ImmutableMap.of();

        public onNavigationEvent(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback) {
            this.onNavigationEvent = onextracallback;
        }

        public BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult IAuthTabCallback() {
            return this.onTransact;
        }

        public BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onWarmupCompleted() {
            if (this.onExtraCallbackWithResult.isEmpty()) {
                return null;
            }
            return (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) Iterables.getLast(this.onExtraCallbackWithResult);
        }

        public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult) {
            return (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) this.IAuthTabCallback.get(onextracallbackwithresult);
        }

        public void IAuthTabCallback(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0) {
            this.onWarmupCompleted = onNavigationEvent(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, this.onExtraCallbackWithResult, this.onExtraCallback, this.onNavigationEvent);
        }

        public void onWarmupCompleted(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0) {
            this.onWarmupCompleted = onNavigationEvent(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, this.onExtraCallbackWithResult, this.onExtraCallback, this.onNavigationEvent);
            IAuthTabCallback(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.newSession());
        }

        public void onNavigationEvent(List<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> list, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0) {
            this.onExtraCallbackWithResult = ImmutableList.copyOf(list);
            if (!list.isEmpty()) {
                this.onExtraCallback = list.get(0);
                this.onTransact = (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallbackwithresult);
            }
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = onNavigationEvent(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, this.onExtraCallbackWithResult, this.onExtraCallback, this.onNavigationEvent);
            }
            IAuthTabCallback(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.newSession());
        }

        private void IAuthTabCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
            ImmutableMap.Builder<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10> builder = ImmutableMap.builder();
            if (this.onExtraCallbackWithResult.isEmpty()) {
                onExtraCallbackWithResult(builder, this.onExtraCallback, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                if (!Objects.equals(this.onTransact, this.onExtraCallback)) {
                    onExtraCallbackWithResult(builder, this.onTransact, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                }
                if (!Objects.equals(this.onWarmupCompleted, this.onExtraCallback) && !Objects.equals(this.onWarmupCompleted, this.onTransact)) {
                    onExtraCallbackWithResult(builder, this.onWarmupCompleted, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                }
            } else {
                for (int i2 = 0; i2 < this.onExtraCallbackWithResult.size(); i2++) {
                    onExtraCallbackWithResult(builder, (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) this.onExtraCallbackWithResult.get(i2), coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                }
                if (!this.onExtraCallbackWithResult.contains(this.onWarmupCompleted)) {
                    onExtraCallbackWithResult(builder, this.onWarmupCompleted, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                }
            }
            this.IAuthTabCallback = builder.buildOrThrow();
        }

        private void onExtraCallbackWithResult(ImmutableMap.Builder<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10> builder, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) {
            if (onextracallbackwithresult != null) {
                if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback(onextracallbackwithresult.onExtraCallback) != -1) {
                    builder.put(onextracallbackwithresult, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
                    return;
                }
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102 = (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) this.IAuthTabCallback.get(onextracallbackwithresult);
                if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102 != null) {
                    builder.put(onextracallbackwithresult, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda102);
                }
            }
        }

        private static BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onNavigationEvent(AndroidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0 androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0, ImmutableList<BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult> immutableList, @Nullable BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession = androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.newSession();
            int iMayLaunchUrl = androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.mayLaunchUrl();
            Object objOnNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback() ? null : coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onNavigationEvent(iMayLaunchUrl);
            int iIAuthTabCallback = (androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IPostMessageServiceDefault() || coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.onExtraCallback()) ? -1 : coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10NewSession.IAuthTabCallback(iMayLaunchUrl, onextracallback).IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.ICustomTabsCallback_Parcel()) - onextracallback.onWarmupCompleted());
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult2 = (BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult) immutableList.get(i2);
                if (onExtraCallbackWithResult(onextracallbackwithresult2, objOnNavigationEvent, androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IPostMessageServiceDefault(), androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.ICustomTabsCallbackDefault(), androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.extraCommand(), iIAuthTabCallback)) {
                    return onextracallbackwithresult2;
                }
            }
            if (immutableList.isEmpty() && onextracallbackwithresult != null) {
                if (onExtraCallbackWithResult(onextracallbackwithresult, objOnNavigationEvent, androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.IPostMessageServiceDefault(), androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.ICustomTabsCallbackDefault(), androidLegacyPlatformTextInputServiceAdapterstartInput211ExternalSyntheticLambda0.extraCommand(), iIAuthTabCallback)) {
                    return onextracallbackwithresult;
                }
            }
            return null;
        }

        private static boolean onExtraCallbackWithResult(BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, @Nullable Object obj, boolean z, int i2, int i3, int i4) {
            if (!onextracallbackwithresult.onExtraCallback.equals(obj)) {
                return false;
            }
            if (z && onextracallbackwithresult.onWarmupCompleted == i2 && onextracallbackwithresult.IAuthTabCallback == i3) {
                return true;
            }
            return !z && onextracallbackwithresult.onWarmupCompleted == -1 && onextracallbackwithresult.onExtraCallbackWithResult == i4;
        }
    }
}
