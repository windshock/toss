package o;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda23;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.OutlinedTextFieldKtExternalSyntheticLambda5;
import o.TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1;
import o.TextFieldKeyEventHandlerExternalSyntheticLambda1;
import o.TextToolbarHelperApi28ExternalSyntheticLambda1;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OutlinedTextFieldKtExternalSyntheticLambda9 {
    private static final byte[] onNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent("OpusHead");

    interface onTransact {
        int IAuthTabCallback();

        int onExtraCallbackWithResult();

        int onWarmupCompleted();
    }

    public static int IAuthTabCallback(int i2) {
        return i2 & 16777215;
    }

    private static int onNavigationEvent(int i2) {
        if (i2 == 1936684398) {
            return 1;
        }
        if (i2 == 1986618469) {
            return 2;
        }
        if (i2 == 1952807028 || i2 == 1935832172 || i2 == 1937072756 || i2 == 1668047728 || i2 == 1937072752) {
            return 3;
        }
        return i2 == 1835365473 ? 5 : -1;
    }

    public static int onWarmupCompleted(int i2) {
        return i2 >>> 24;
    }

    public static List<ProgressIndicatorKtExternalSyntheticLambda14> onWarmupCompleted(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback, ElevationOverlayKtExternalSyntheticLambda1 elevationOverlayKtExternalSyntheticLambda1, long j, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, boolean z, boolean z2, Function<ProgressIndicatorKtExternalSyntheticLambda12, ProgressIndicatorKtExternalSyntheticLambda12> function) throws ParserException {
        ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < onextracallback.onExtraCallbackWithResult.size(); i2++) {
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback2 = onextracallback.onExtraCallbackWithResult.get(i2);
            if (onextracallback2.onExtraCallback == 1953653099 && (progressIndicatorKtExternalSyntheticLambda12 = (ProgressIndicatorKtExternalSyntheticLambda12) function.apply(onNavigationEvent(onextracallback2, (TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.onNavigationEvent(1836476516)), j, basicTextContextMenuProviderExternalSyntheticLambda0, z, z2))) != null) {
                arrayList.add(onNavigationEvent(progressIndicatorKtExternalSyntheticLambda12, (TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback2.IAuthTabCallback(1835297121))).IAuthTabCallback(1835626086))).IAuthTabCallback(1937007212)), elevationOverlayKtExternalSyntheticLambda1));
            }
        }
        return arrayList;
    }

    public static HandwritingHandlerNodeExternalSyntheticLambda0 onNavigationEvent(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = onextracallbackwithresult.onNavigationEvent;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0 = new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[0]);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 8) {
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (iAsBinder2 == 1835365473) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
                handwritingHandlerNodeExternalSyntheticLambda0 = handwritingHandlerNodeExternalSyntheticLambda0.onNavigationEvent(onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted + iAsBinder));
            } else if (iAsBinder2 == 1936553057) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
                handwritingHandlerNodeExternalSyntheticLambda0 = handwritingHandlerNodeExternalSyntheticLambda0.onNavigationEvent(ProgressIndicatorKtExternalSyntheticLambda0.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted + iAsBinder));
            } else if (iAsBinder2 == -1451722374) {
                handwritingHandlerNodeExternalSyntheticLambda0 = handwritingHandlerNodeExternalSyntheticLambda0.onNavigationEvent(asInterface(textFieldDecoratorModifierNodeExternalSyntheticLambda20));
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted + iAsBinder);
        }
        return handwritingHandlerNodeExternalSyntheticLambda0;
    }

    public static TextFieldTextLayoutModifierNodeExternalSyntheticLambda0 onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        long typedObject;
        long typedObject2;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        if (onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder()) == 0) {
            typedObject = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
            typedObject2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        } else {
            typedObject = textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject();
            typedObject2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject();
        }
        return new TextFieldTextLayoutModifierNodeExternalSyntheticLambda0(typedObject, typedObject2, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized());
    }

    public static HandwritingHandlerNodeExternalSyntheticLambda0 IAuthTabCallback(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback) {
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onextracallback.onNavigationEvent(1751411826);
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent2 = onextracallback.onNavigationEvent(1801812339);
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent3 = onextracallback.onNavigationEvent(1768715124);
        if (onextracallbackwithresultOnNavigationEvent == null || onextracallbackwithresultOnNavigationEvent2 == null || onextracallbackwithresultOnNavigationEvent3 == null || onTransact(onextracallbackwithresultOnNavigationEvent.onNavigationEvent) != 1835299937) {
            return null;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = onextracallbackwithresultOnNavigationEvent2.onNavigationEvent;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(12);
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        String[] strArr = new String[iAsBinder];
        for (int i2 = 0; i2 < iAsBinder; i2++) {
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
            strArr[i2] = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(iAsBinder2 - 8);
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = onextracallbackwithresultOnNavigationEvent3.onNavigationEvent;
        textFieldDecoratorModifierNodeExternalSyntheticLambda202.asBinder(8);
        ArrayList arrayList = new ArrayList();
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda202.onNavigationEvent() > 8) {
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda202.onWarmupCompleted();
            int iAsBinder3 = textFieldDecoratorModifierNodeExternalSyntheticLambda202.asBinder();
            int iAsBinder4 = textFieldDecoratorModifierNodeExternalSyntheticLambda202.asBinder() - 1;
            if (iAsBinder4 >= 0 && iAsBinder4 < iAsBinder) {
                TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0IAuthTabCallback = OutlinedTextFieldMeasurePolicyExternalSyntheticLambda1.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda202, iOnWarmupCompleted + iAsBinder3, strArr[iAsBinder4]);
                if (textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0IAuthTabCallback != null) {
                    arrayList.add(textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0IAuthTabCallback);
                }
            } else {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("BoxParsers", "Skipped metadata with unknown key index: " + iAsBinder4);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda202.asBinder(iOnWarmupCompleted + iAsBinder3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new HandwritingHandlerNodeExternalSyntheticLambda0(arrayList);
    }

    public static void onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() != 1751411826) {
            iOnWarmupCompleted += 4;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static ProgressIndicatorKtExternalSyntheticLambda12 onNavigationEvent(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback, TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult, long j, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, boolean z, boolean z2) throws ParserException {
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult2;
        long j2;
        long[] jArr;
        long[] jArr2;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent;
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0;
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallbackIAuthTabCallback;
        Pair<long[], long[]> pairOnWarmupCompleted;
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback2 = (TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.IAuthTabCallback(1835297121));
        int iOnNavigationEvent = onNavigationEvent(onTransact(((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback2.onNavigationEvent(1751411826))).onNavigationEvent));
        if (iOnNavigationEvent == -1) {
            return null;
        }
        access000 access000VarAsBinder = asBinder(((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.onNavigationEvent(1953196132))).onNavigationEvent);
        if (j == -9223372036854775807L) {
            onextracallbackwithresult2 = onextracallbackwithresult;
            j2 = access000VarAsBinder.IAuthTabCallback;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
            j2 = j;
        }
        long j3 = onExtraCallback(onextracallbackwithresult2.onNavigationEvent).onWarmupCompleted;
        long jIAuthTabCallback = j2 != -9223372036854775807L ? TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j2, 1000000L, j3) : -9223372036854775807L;
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback3 = (TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback2.IAuthTabCallback(1835626086))).IAuthTabCallback(1937007212));
        onNavigationEvent onnavigationeventIAuthTabCallbackDefault = IAuthTabCallbackDefault(((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback2.onNavigationEvent(1835296868))).onNavigationEvent);
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onextracallback3.onNavigationEvent(1937011556);
        if (onextracallbackwithresultOnNavigationEvent == null) {
            throw ParserException.onNavigationEvent("Malformed sample table (stbl) missing sample description (stsd)", (Throwable) null);
        }
        asInterface asinterfaceOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresultOnNavigationEvent.onNavigationEvent, access000VarAsBinder, onnavigationeventIAuthTabCallbackDefault.onExtraCallbackWithResult, basicTextContextMenuProviderExternalSyntheticLambda0, z2);
        if (z || (onextracallbackIAuthTabCallback = onextracallback.IAuthTabCallback(1701082227)) == null || (pairOnWarmupCompleted = onWarmupCompleted(onextracallbackIAuthTabCallback)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairOnWarmupCompleted.first;
            jArr2 = (long[]) pairOnWarmupCompleted.second;
            jArr = jArr3;
        }
        if (asinterfaceOnWarmupCompleted.onWarmupCompleted == null) {
            return null;
        }
        if (access000VarAsBinder.onExtraCallbackWithResult != 0) {
            TextFieldDecoratorModifierNodepointerInputNode1112ExternalSyntheticLambda0 textFieldDecoratorModifierNodepointerInputNode1112ExternalSyntheticLambda0 = new TextFieldDecoratorModifierNodepointerInputNode1112ExternalSyntheticLambda0(access000VarAsBinder.onExtraCallbackWithResult);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = asinterfaceOnWarmupCompleted.onWarmupCompleted.onExtraCallback();
            HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda02 = asinterfaceOnWarmupCompleted.onWarmupCompleted.ICustomTabsCallbackDefault;
            if (handwritingHandlerNodeExternalSyntheticLambda02 != null) {
                handwritingHandlerNodeExternalSyntheticLambda0 = handwritingHandlerNodeExternalSyntheticLambda02.onWarmupCompleted(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{textFieldDecoratorModifierNodepointerInputNode1112ExternalSyntheticLambda0});
            } else {
                handwritingHandlerNodeExternalSyntheticLambda0 = new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{textFieldDecoratorModifierNodepointerInputNode1112ExternalSyntheticLambda0});
            }
            basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0).onNavigationEvent();
        } else {
            basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = asinterfaceOnWarmupCompleted.onWarmupCompleted;
        }
        return new ProgressIndicatorKtExternalSyntheticLambda12(access000VarAsBinder.onNavigationEvent, iOnNavigationEvent, onnavigationeventIAuthTabCallbackDefault.onNavigationEvent, j3, jIAuthTabCallback, onnavigationeventIAuthTabCallbackDefault.IAuthTabCallback, basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent, asinterfaceOnWarmupCompleted.onNavigationEvent, asinterfaceOnWarmupCompleted.onExtraCallbackWithResult, asinterfaceOnWarmupCompleted.IAuthTabCallback, jArr, jArr2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Removed duplicated region for block: B:111:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ProgressIndicatorKtExternalSyntheticLambda14 onNavigationEvent(ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12, TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback, ElevationOverlayKtExternalSyntheticLambda1 elevationOverlayKtExternalSyntheticLambda1) throws ParserException {
        onTransact iAuthTabCallbackDefault;
        boolean z;
        int iICustomTabsCallbackDefault;
        int iICustomTabsCallbackDefault2;
        int iICustomTabsCallbackDefault3;
        int i2;
        int i3;
        long[] jArr;
        int[] iArr;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        int i4;
        int i5;
        boolean z2;
        int i6;
        ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12OnExtraCallback;
        int[] iArr2;
        long[] jArr2;
        long j;
        long j2;
        int i7;
        int i8;
        int i9;
        int i10;
        int iAsBinder;
        int i11;
        int[] iArr3;
        int i12;
        int i13;
        long[] jArr3;
        boolean z3;
        int[] iArr4;
        long[] jArr4;
        long[] jArr5;
        int[] iArr5;
        int[] iArr6;
        boolean z4;
        int i14;
        ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12OnExtraCallback2 = progressIndicatorKtExternalSyntheticLambda12;
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onextracallback.onNavigationEvent(1937011578);
        if (onextracallbackwithresultOnNavigationEvent != null) {
            iAuthTabCallbackDefault = new IAuthTabCallbackStub(onextracallbackwithresultOnNavigationEvent, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback2.onNavigationEvent);
        } else {
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent2 = onextracallback.onNavigationEvent(1937013298);
            if (onextracallbackwithresultOnNavigationEvent2 == null) {
                throw ParserException.onNavigationEvent("Track has no sample table size information", (Throwable) null);
            }
            iAuthTabCallbackDefault = new IAuthTabCallbackDefault(onextracallbackwithresultOnNavigationEvent2);
        }
        int iOnWarmupCompleted = iAuthTabCallbackDefault.onWarmupCompleted();
        if (iOnWarmupCompleted == 0) {
            return new ProgressIndicatorKtExternalSyntheticLambda14(progressIndicatorKtExternalSyntheticLambda12, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (progressIndicatorKtExternalSyntheticLambda12OnExtraCallback2.IAuthTabCallback_Parcel == 2) {
            long j3 = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback2.asInterface;
            if (j3 > 0) {
                progressIndicatorKtExternalSyntheticLambda12OnExtraCallback2 = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback2.onExtraCallback(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback2.onNavigationEvent.onExtraCallback().onWarmupCompleted(iOnWarmupCompleted / (j3 / 1000000.0f)).onNavigationEvent());
            }
        }
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent3 = onextracallback.onNavigationEvent(1937007471);
        if (onextracallbackwithresultOnNavigationEvent3 == null) {
            onextracallbackwithresultOnNavigationEvent3 = (TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.onNavigationEvent(1668232756));
            z = true;
        } else {
            z = false;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = onextracallbackwithresultOnNavigationEvent3.onNavigationEvent;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = ((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.onNavigationEvent(1937011555))).onNavigationEvent;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda203 = ((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.onNavigationEvent(1937011827))).onNavigationEvent;
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent4 = onextracallback.onNavigationEvent(1937011571);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda204 = onextracallbackwithresultOnNavigationEvent4 != null ? onextracallbackwithresultOnNavigationEvent4.onNavigationEvent : null;
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent5 = onextracallback.onNavigationEvent(1668576371);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda205 = onextracallbackwithresultOnNavigationEvent5 != null ? onextracallbackwithresultOnNavigationEvent5.onNavigationEvent : null;
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda202, textFieldDecoratorModifierNodeExternalSyntheticLambda20, z);
        textFieldDecoratorModifierNodeExternalSyntheticLambda203.asBinder(12);
        int iICustomTabsCallbackDefault4 = textFieldDecoratorModifierNodeExternalSyntheticLambda203.ICustomTabsCallbackDefault() - 1;
        int iICustomTabsCallbackDefault5 = textFieldDecoratorModifierNodeExternalSyntheticLambda203.ICustomTabsCallbackDefault();
        int iICustomTabsCallbackDefault6 = textFieldDecoratorModifierNodeExternalSyntheticLambda203.ICustomTabsCallbackDefault();
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda205 != null) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda205.asBinder(12);
            iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda205.ICustomTabsCallbackDefault();
        } else {
            iICustomTabsCallbackDefault = 0;
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda204 != null) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda204.asBinder(12);
            iICustomTabsCallbackDefault3 = textFieldDecoratorModifierNodeExternalSyntheticLambda204.ICustomTabsCallbackDefault();
            if (iICustomTabsCallbackDefault3 > 0) {
                iICustomTabsCallbackDefault2 = textFieldDecoratorModifierNodeExternalSyntheticLambda204.ICustomTabsCallbackDefault() - 1;
            } else {
                iICustomTabsCallbackDefault2 = -1;
                textFieldDecoratorModifierNodeExternalSyntheticLambda204 = null;
            }
        } else {
            iICustomTabsCallbackDefault2 = -1;
            iICustomTabsCallbackDefault3 = 0;
        }
        int iIAuthTabCallback = iAuthTabCallbackDefault.IAuthTabCallback();
        String str = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback2.onNavigationEvent.isEngagementSignalsApiAvailable;
        if (iIAuthTabCallback != -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && iICustomTabsCallbackDefault4 == 0 && iICustomTabsCallbackDefault == 0 && iICustomTabsCallbackDefault3 == 0)) {
            int i15 = iAuthTabCallback.onNavigationEvent;
            long[] jArr6 = new long[i15];
            int[] iArr7 = new int[i15];
            while (iAuthTabCallback.onExtraCallbackWithResult()) {
                int i16 = iAuthTabCallback.onWarmupCompleted;
                jArr6[i16] = iAuthTabCallback.IAuthTabCallback;
                iArr7[i16] = iAuthTabCallback.onExtraCallback;
            }
            OutlinedTextFieldKtExternalSyntheticLambda5.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = OutlinedTextFieldKtExternalSyntheticLambda5.IAuthTabCallback(iIAuthTabCallback, jArr6, iArr7, iICustomTabsCallbackDefault6);
            jArr = onextracallbackwithresultIAuthTabCallback.IAuthTabCallback;
            int[] iArr8 = onextracallbackwithresultIAuthTabCallback.onExtraCallback;
            int i17 = onextracallbackwithresultIAuthTabCallback.onWarmupCompleted;
            long[] jArr7 = onextracallbackwithresultIAuthTabCallback.IAuthTabCallbackStub;
            iArrCopyOf = onextracallbackwithresultIAuthTabCallback.onNavigationEvent;
            long j4 = onextracallbackwithresultIAuthTabCallback.onExtraCallbackWithResult;
            j2 = onextracallbackwithresultIAuthTabCallback.asInterface;
            progressIndicatorKtExternalSyntheticLambda12OnExtraCallback = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback2;
            iArr2 = iArr8;
            i2 = i17;
            jArr2 = jArr7;
            j = j4;
        } else {
            long[] jArr8 = new long[iOnWarmupCompleted];
            int[] iArr9 = new int[iOnWarmupCompleted];
            long[] jArr9 = new long[iOnWarmupCompleted];
            int[] iArr10 = new int[iOnWarmupCompleted];
            int i18 = iICustomTabsCallbackDefault4;
            int iICustomTabsCallbackDefault7 = iICustomTabsCallbackDefault2;
            int i19 = iICustomTabsCallbackDefault;
            i2 = 0;
            int i20 = 0;
            int iAsBinder2 = 0;
            int iICustomTabsCallbackDefault8 = 0;
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda122 = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback2;
            int i21 = 0;
            while (true) {
                if (i21 >= iOnWarmupCompleted) {
                    i3 = iICustomTabsCallbackDefault3;
                    jArr = jArr8;
                    iArr = iArr9;
                    jArrCopyOf = jArr9;
                    iArrCopyOf = iArr10;
                    i4 = i20;
                    i5 = iAsBinder2;
                    break;
                }
                long j8 = j6;
                int i22 = i20;
                boolean zOnExtraCallbackWithResult = true;
                while (i22 == 0) {
                    zOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
                    if (!zOnExtraCallbackWithResult) {
                        break;
                    }
                    int i23 = iICustomTabsCallbackDefault6;
                    long j9 = iAuthTabCallback.IAuthTabCallback;
                    i22 = iAuthTabCallback.onExtraCallback;
                    j8 = j9;
                    iICustomTabsCallbackDefault6 = i23;
                    iICustomTabsCallbackDefault3 = iICustomTabsCallbackDefault3;
                    iOnWarmupCompleted = iOnWarmupCompleted;
                }
                int i24 = iOnWarmupCompleted;
                int i25 = iICustomTabsCallbackDefault6;
                i3 = iICustomTabsCallbackDefault3;
                if (!zOnExtraCallbackWithResult) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr8, i21);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr9, i21);
                    jArrCopyOf = Arrays.copyOf(jArr9, i21);
                    iArrCopyOf = Arrays.copyOf(iArr10, i21);
                    jArr = jArrCopyOf2;
                    iArr = iArrCopyOf2;
                    i5 = iAsBinder2;
                    iOnWarmupCompleted = i21;
                    i4 = i22;
                    break;
                }
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda205 != null) {
                    while (iICustomTabsCallbackDefault8 == 0 && i19 > 0) {
                        iICustomTabsCallbackDefault8 = textFieldDecoratorModifierNodeExternalSyntheticLambda205.ICustomTabsCallbackDefault();
                        iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda205.asBinder();
                        i19--;
                    }
                    iICustomTabsCallbackDefault8--;
                }
                int i26 = iAsBinder2;
                jArr8[i21] = j8;
                int iOnExtraCallbackWithResult = iAuthTabCallbackDefault.onExtraCallbackWithResult();
                iArr9[i21] = iOnExtraCallbackWithResult;
                IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                onTransact ontransact = iAuthTabCallbackDefault;
                j5 += iOnExtraCallbackWithResult;
                if (iOnExtraCallbackWithResult > i2) {
                    i2 = iOnExtraCallbackWithResult;
                }
                jArr9[i21] = j7 + i26;
                iArr10[i21] = textFieldDecoratorModifierNodeExternalSyntheticLambda204 == null ? 1 : 0;
                if (i21 == iICustomTabsCallbackDefault7) {
                    iArr10[i21] = 1;
                    i10 = i3 - 1;
                    if (i10 > 0) {
                        iICustomTabsCallbackDefault7 = ((TextFieldDecoratorModifierNodeExternalSyntheticLambda20) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda204)).ICustomTabsCallbackDefault() - 1;
                    }
                    i7 = iICustomTabsCallbackDefault7;
                    i8 = i26;
                    i9 = i25;
                } else {
                    i7 = iICustomTabsCallbackDefault7;
                    i8 = i26;
                    i9 = i25;
                    i10 = i3;
                }
                j7 += i9;
                iICustomTabsCallbackDefault5--;
                if (iICustomTabsCallbackDefault5 != 0 || i18 <= 0) {
                    iAsBinder = i9;
                    i11 = i18;
                } else {
                    int iICustomTabsCallbackDefault9 = textFieldDecoratorModifierNodeExternalSyntheticLambda203.ICustomTabsCallbackDefault();
                    iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda203.asBinder();
                    i11 = i18 - 1;
                    iICustomTabsCallbackDefault5 = iICustomTabsCallbackDefault9;
                }
                int i27 = iAsBinder;
                long j10 = iArr9[i21];
                i20 = i22 - 1;
                i21++;
                j6 = j8 + j10;
                iAsBinder2 = i8;
                iICustomTabsCallbackDefault7 = i7;
                iOnWarmupCompleted = i24;
                iAuthTabCallback = iAuthTabCallback2;
                int i28 = i11;
                iICustomTabsCallbackDefault6 = i27;
                i18 = i28;
                iICustomTabsCallbackDefault3 = i10;
                iAuthTabCallbackDefault = ontransact;
            }
            long j11 = i5;
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda205 != null) {
                while (i19 > 0) {
                    if (textFieldDecoratorModifierNodeExternalSyntheticLambda205.ICustomTabsCallbackDefault() != 0) {
                        z2 = false;
                        break;
                    }
                    textFieldDecoratorModifierNodeExternalSyntheticLambda205.asBinder();
                    i19--;
                }
                z2 = true;
                if (i3 != 0 && iICustomTabsCallbackDefault5 == 0 && i4 == 0 && i18 == 0) {
                    i6 = iICustomTabsCallbackDefault8;
                    if (i6 == 0 && z2) {
                        progressIndicatorKtExternalSyntheticLambda12OnExtraCallback = progressIndicatorKtExternalSyntheticLambda122;
                    }
                    iArr2 = iArr;
                    jArr2 = jArrCopyOf;
                    j = j7 + j11;
                    j2 = j5;
                } else {
                    i6 = iICustomTabsCallbackDefault8;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent stbl box for track ");
                progressIndicatorKtExternalSyntheticLambda12OnExtraCallback = progressIndicatorKtExternalSyntheticLambda122;
                sb.append(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallback);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i3);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(iICustomTabsCallbackDefault5);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i4);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i18);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i6);
                sb.append(z2 ? ", ctts invalid" : "");
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("BoxParsers", sb.toString());
                iArr2 = iArr;
                jArr2 = jArrCopyOf;
                j = j7 + j11;
                j2 = j5;
            } else {
                z2 = true;
                if (i3 != 0) {
                    i6 = iICustomTabsCallbackDefault8;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Inconsistent stbl box for track ");
                    progressIndicatorKtExternalSyntheticLambda12OnExtraCallback = progressIndicatorKtExternalSyntheticLambda122;
                    sb2.append(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallback);
                    sb2.append(": remainingSynchronizationSamples ");
                    sb2.append(i3);
                    sb2.append(", remainingSamplesAtTimestampDelta ");
                    sb2.append(iICustomTabsCallbackDefault5);
                    sb2.append(", remainingSamplesInChunk ");
                    sb2.append(i4);
                    sb2.append(", remainingTimestampDeltaChanges ");
                    sb2.append(i18);
                    sb2.append(", remainingSamplesAtTimestampOffset ");
                    sb2.append(i6);
                    sb2.append(z2 ? ", ctts invalid" : "");
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("BoxParsers", sb2.toString());
                    iArr2 = iArr;
                    jArr2 = jArrCopyOf;
                    j = j7 + j11;
                    j2 = j5;
                }
            }
        }
        int[] iArr11 = iArrCopyOf;
        long j12 = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.asInterface;
        if (j12 > 0) {
            long jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(j2 << 3, 1000000L, j12, RoundingMode.HALF_DOWN);
            if (jOnExtraCallback > 0 && jOnExtraCallback < 2147483647L) {
                progressIndicatorKtExternalSyntheticLambda12OnExtraCallback = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallback(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onNavigationEvent.onExtraCallback().onNavigationEvent((int) jOnExtraCallback).onNavigationEvent());
            }
        }
        int[] iArr12 = iArr11;
        long jIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j, 1000000L, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackStub);
        long[] jArr10 = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallback;
        if (jArr10 == null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jArr2, 1000000L, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackStub);
            return new ProgressIndicatorKtExternalSyntheticLambda14(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback, jArr, iArr2, i2, jArr2, iArr12, jIAuthTabCallback);
        }
        if (jArr10.length == 1 && progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallback_Parcel == 1 && jArr2.length >= 2) {
            long j13 = ((long[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallbackWithResult))[0];
            long jIAuthTabCallback2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallback[0], progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackStub, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackDefault) + j13;
            if (onExtraCallbackWithResult(jArr2, j, j13, jIAuthTabCallback2)) {
                iArr3 = iArr2;
                i12 = iOnWarmupCompleted;
                i13 = i2;
                long[] jArr11 = jArr2;
                long jIAuthTabCallback3 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j13 - jArr2[0], progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onNavigationEvent.prefetch, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackStub);
                long jIAuthTabCallback4 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j - jIAuthTabCallback2, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onNavigationEvent.prefetch, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackStub);
                if (!(jIAuthTabCallback3 == 0 && jIAuthTabCallback4 == 0) && jIAuthTabCallback3 <= 2147483647L && jIAuthTabCallback4 <= 2147483647L) {
                    elevationOverlayKtExternalSyntheticLambda1.IAuthTabCallback = (int) jIAuthTabCallback3;
                    elevationOverlayKtExternalSyntheticLambda1.onWarmupCompleted = (int) jIAuthTabCallback4;
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jArr11, 1000000L, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackStub);
                    return new ProgressIndicatorKtExternalSyntheticLambda14(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback, jArr, iArr3, i13, jArr11, iArr12, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallback[0], 1000000L, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackDefault));
                }
                jArr3 = jArr11;
            }
        } else {
            iArr3 = iArr2;
            i12 = iOnWarmupCompleted;
            i13 = i2;
            jArr3 = jArr2;
        }
        long[] jArr12 = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallback;
        if (jArr12.length == 1 && jArr12[0] == 0) {
            long j14 = ((long[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallbackWithResult))[0];
            for (int i29 = 0; i29 < jArr3.length; i29++) {
                jArr3[i29] = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(jArr3[i29] - j14, 1000000L, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackStub);
            }
            return new ProgressIndicatorKtExternalSyntheticLambda14(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback, jArr, iArr3, i13, jArr3, iArr12, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j - j14, 1000000L, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackStub));
        }
        boolean z5 = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallback_Parcel == 1;
        int[] iArr13 = new int[jArr12.length];
        int[] iArr14 = new int[jArr12.length];
        long[] jArr13 = (long[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallbackWithResult);
        int i30 = 0;
        int i31 = 0;
        boolean z6 = false;
        int i32 = 0;
        while (true) {
            long[] jArr14 = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallback;
            if (i30 >= jArr14.length) {
                break;
            }
            long j15 = jArr13[i30];
            if (j15 != -1) {
                long j16 = jArr14[i30];
                jArr4 = jArr;
                jArr5 = jArr13;
                boolean z7 = z6;
                iArr5 = iArr3;
                long jIAuthTabCallback5 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j16, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackStub, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackDefault);
                iArr13[i30] = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jArr3, j15, true, true);
                long j17 = j15 + jIAuthTabCallback5;
                iArr14[i30] = ((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1100701149, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{jArr3, Long.valueOf(j17), Boolean.valueOf(z5), false}, -1100701127)).intValue();
                int i33 = iArr13[i30];
                while (true) {
                    i14 = iArr13[i30];
                    iArr6 = iArr12;
                    if (i14 < 0 || (iArr6[i14] & 1) != 0) {
                        break;
                    }
                    iArr13[i30] = i14 - 1;
                    iArr12 = iArr6;
                }
                if (i14 < 0) {
                    iArr13[i30] = i33;
                    while (true) {
                        int i34 = iArr13[i30];
                        if (i34 >= iArr14[i30] || (iArr6[i34] & 1) != 0) {
                            break;
                        }
                        iArr13[i30] = i34 + 1;
                    }
                }
                if (progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallback_Parcel == 2 && iArr13[i30] != iArr14[i30]) {
                    while (true) {
                        int i35 = iArr14[i30];
                        if (i35 >= jArr3.length - 1) {
                            break;
                        }
                        int i36 = i35 + 1;
                        if (jArr3[i36] > j17) {
                            break;
                        }
                        iArr14[i30] = i36;
                    }
                }
                int i37 = iArr14[i30];
                int i38 = iArr13[i30];
                i31 += i37 - i38;
                z4 = z7 | (i32 != i38);
                i32 = i37;
            } else {
                jArr4 = jArr;
                jArr5 = jArr13;
                iArr5 = iArr3;
                iArr6 = iArr12;
                z4 = z6;
            }
            i30++;
            z6 = z4;
            iArr12 = iArr6;
            jArr = jArr4;
            iArr3 = iArr5;
            jArr13 = jArr5;
        }
        long[] jArr15 = jArr;
        boolean z8 = z6;
        int[] iArr15 = iArr3;
        int i39 = 0;
        int[] iArr16 = iArr12;
        boolean z9 = z8 | (i31 != i12);
        long[] jArr16 = z9 ? new long[i31] : jArr15;
        int[] iArr17 = z9 ? new int[i31] : iArr15;
        int i40 = z9 ? 0 : i13;
        int[] iArr18 = z9 ? new int[i31] : iArr16;
        long[] jArr17 = new long[i31];
        boolean z10 = false;
        int i41 = 0;
        int i42 = i40;
        long j18 = 0;
        while (i39 < progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallback.length) {
            long j19 = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallbackWithResult[i39];
            int i43 = iArr13[i39];
            int[] iArr19 = iArr13;
            int i44 = iArr14[i39];
            int[] iArr20 = iArr14;
            if (z9) {
                int i45 = i44 - i43;
                z3 = z10;
                System.arraycopy(jArr15, i43, jArr16, i41, i45);
                iArr4 = iArr15;
                System.arraycopy(iArr4, i43, iArr17, i41, i45);
                System.arraycopy(iArr16, i43, iArr18, i41, i45);
            } else {
                z3 = z10;
                iArr4 = iArr15;
            }
            int i46 = i42;
            while (i43 < i44) {
                int i47 = i39;
                int[] iArr21 = iArr16;
                long jIAuthTabCallback6 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j18, 1000000L, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackDefault);
                int i48 = i44;
                long[] jArr18 = jArr3;
                long jIAuthTabCallback7 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(jArr3[i43] - j19, 1000000L, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackStub);
                boolean z11 = jIAuthTabCallback7 < 0 ? true : z3;
                jArr17[i41] = jIAuthTabCallback6 + jIAuthTabCallback7;
                if (z9 && iArr17[i41] > i46) {
                    i46 = iArr4[i43];
                }
                i41++;
                i43++;
                z3 = z11;
                iArr16 = iArr21;
                jArr3 = jArr18;
                i44 = i48;
                i39 = i47;
            }
            int i49 = i39;
            j18 += progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallback[i49];
            i39 = i49 + 1;
            i42 = i46;
            iArr13 = iArr19;
            iArr16 = iArr16;
            iArr14 = iArr20;
            iArr15 = iArr4;
            z10 = z3;
        }
        boolean z12 = z10;
        long jIAuthTabCallback8 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j18, 1000000L, progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.IAuthTabCallbackDefault);
        if (z12) {
            progressIndicatorKtExternalSyntheticLambda12OnExtraCallback = progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onExtraCallback(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback.onNavigationEvent.onExtraCallback().onExtraCallback(true).onNavigationEvent());
        }
        return new ProgressIndicatorKtExternalSyntheticLambda14(progressIndicatorKtExternalSyntheticLambda12OnExtraCallback, jArr16, iArr17, i42, jArr17, iArr18, jIAuthTabCallback8);
    }

    private static HandwritingHandlerNodeExternalSyntheticLambda0 onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
        onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() < i2) {
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1768715124) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
                return onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted + iAsBinder);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted + iAsBinder);
        }
        return null;
    }

    private static HandwritingHandlerNodeExternalSyntheticLambda0 onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
        ArrayList arrayList = new ArrayList();
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() < i2) {
            HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback2 = OutlinedTextFieldMeasurePolicyExternalSyntheticLambda1.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            if (IAuthTabCallback2 != null) {
                arrayList.add(IAuthTabCallback2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new HandwritingHandlerNodeExternalSyntheticLambda0(arrayList);
    }

    private static HandwritingHandlerNodeExternalSyntheticLambda0 asInterface(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        short sICustomTabsCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        String strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(sICustomTabsCallback);
        int iMax = Math.max(strOnWarmupCompleted.lastIndexOf(43), strOnWarmupCompleted.lastIndexOf(45));
        try {
            return new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{new TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda0(Float.parseFloat(strOnWarmupCompleted.substring(0, iMax)), Float.parseFloat(strOnWarmupCompleted.substring(iMax, strOnWarmupCompleted.length() - 1)))});
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static access000 asBinder(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        long j;
        int i2;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        int iOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnWarmupCompleted == 0 ? 8 : 16);
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        int iOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int i3 = iOnWarmupCompleted == 0 ? 4 : 8;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i5 < i3) {
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[iOnWarmupCompleted2 + i5] != -1) {
                    long jOnActivityResized = iOnWarmupCompleted == 0 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized() : textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackStubProxy();
                    if (jOnActivityResized != 0) {
                        j = jOnActivityResized;
                    }
                } else {
                    i5++;
                }
            } else {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(i3);
                break;
            }
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(10);
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        int iAsBinder3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        int iAsBinder4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        int iAsBinder5 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (iAsBinder2 != 0 || iAsBinder3 != 65536 || ((iAsBinder4 != -65536 && iAsBinder4 != 65536) || iAsBinder5 != 0)) {
            if (iAsBinder2 == 0 && iAsBinder3 == -65536 && ((iAsBinder4 == 65536 || iAsBinder4 == -65536) && iAsBinder5 == 0)) {
                i2 = 270;
            } else if ((iAsBinder2 == -65536 || iAsBinder2 == 65536) && iAsBinder3 == 0 && iAsBinder4 == 0 && iAsBinder5 == -65536) {
                i2 = 180;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(16);
            short sICustomTabsCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
            return new access000(iAsBinder, j, iOnUnminimized, i2, sICustomTabsCallback, textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback());
        }
        i4 = 90;
        i2 = i4;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(16);
        short sICustomTabsCallback2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        return new access000(iAsBinder, j, iOnUnminimized, i2, sICustomTabsCallback2, textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback());
    }

    private static int onTransact(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(16);
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
    }

    private static onNavigationEvent IAuthTabCallbackDefault(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        long jIAuthTabCallback;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        int iOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnWarmupCompleted == 0 ? 8 : 16);
        long jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        int iOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int i2 = iOnWarmupCompleted == 0 ? 4 : 8;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback()[iOnWarmupCompleted2 + i3] != -1) {
                    long jOnActivityResized2 = iOnWarmupCompleted == 0 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized() : textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackStubProxy();
                    if (jOnActivityResized2 == 0) {
                        break;
                    }
                    jIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(jOnActivityResized2, 1000000L, jOnActivityResized);
                } else {
                    i3++;
                }
            } else {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(i2);
                break;
            }
        }
        jIAuthTabCallback = -9223372036854775807L;
        return new onNavigationEvent(jOnActivityResized, jIAuthTabCallback, onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized()));
    }

    private static String onExtraCallbackWithResult(int i2) {
        char[] cArr = {(char) (((i2 >> 10) & 31) + 96), (char) (((i2 >> 5) & 31) + 96), (char) ((i2 & 31) + 96)};
        for (int i3 = 0; i3 < 3; i3++) {
            char c = cArr[i3];
            if (c < 'a' || c > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static asInterface onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, access000 access000Var, @Nullable String str, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, boolean z) throws ParserException {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(12);
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        asInterface asinterface = new asInterface(iAsBinder);
        for (int i2 = 0; i2 < iAsBinder; i2++) {
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(iAsBinder2 > 0, "childAtomSize must be positive");
            int iAsBinder3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (iAsBinder3 == 1635148593 || iAsBinder3 == 1635148595 || iAsBinder3 == 1701733238 || iAsBinder3 == 1831958048 || iAsBinder3 == 1836070006 || iAsBinder3 == 1752589105 || iAsBinder3 == 1751479857 || iAsBinder3 == 1932670515 || iAsBinder3 == 1211250227 || iAsBinder3 == 1748121139 || iAsBinder3 == 1987063864 || iAsBinder3 == 1987063865 || iAsBinder3 == 1635135537 || iAsBinder3 == 1685479798 || iAsBinder3 == 1685479729 || iAsBinder3 == 1685481573 || iAsBinder3 == 1685481521 || iAsBinder3 == 1634760241) {
                IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iAsBinder3, iOnWarmupCompleted, iAsBinder2, access000Var.onNavigationEvent, str, access000Var.onExtraCallback, basicTextContextMenuProviderExternalSyntheticLambda0, asinterface, i2);
            } else if (iAsBinder3 == 1836069985 || iAsBinder3 == 1701733217 || iAsBinder3 == 1633889587 || iAsBinder3 == 1700998451 || iAsBinder3 == 1633889588 || iAsBinder3 == 1835823201 || iAsBinder3 == 1685353315 || iAsBinder3 == 1685353317 || iAsBinder3 == 1685353320 || iAsBinder3 == 1685353324 || iAsBinder3 == 1685353336 || iAsBinder3 == 1935764850 || iAsBinder3 == 1935767394 || iAsBinder3 == 1819304813 || iAsBinder3 == 1936684916 || iAsBinder3 == 1953984371 || iAsBinder3 == 778924082 || iAsBinder3 == 778924083 || iAsBinder3 == 1835557169 || iAsBinder3 == 1835560241 || iAsBinder3 == 1634492771 || iAsBinder3 == 1634492791 || iAsBinder3 == 1970037111 || iAsBinder3 == 1332770163 || iAsBinder3 == 1716281667 || iAsBinder3 == 1767992678 || iAsBinder3 == 1768973165 || iAsBinder3 == 1718641517) {
                onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iAsBinder3, iOnWarmupCompleted, iAsBinder2, access000Var.onNavigationEvent, str, z, basicTextContextMenuProviderExternalSyntheticLambda0, asinterface, i2);
            } else if (iAsBinder3 == 1414810956 || iAsBinder3 == 1954034535 || iAsBinder3 == 2004251764 || iAsBinder3 == 1937010800 || iAsBinder3 == 1664495672 || iAsBinder3 == 1836070003) {
                onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iAsBinder3, iOnWarmupCompleted, iAsBinder2, access000Var, str, asinterface);
            } else if (iAsBinder3 == 1835365492) {
                onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iAsBinder3, iOnWarmupCompleted, access000Var.onNavigationEvent, asinterface);
            } else if (iAsBinder3 == 1667329389) {
                asinterface.onWarmupCompleted = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallback_Parcel(access000Var.onNavigationEvent).IAuthTabCallbackDefault("application/x-camera-motion").onNavigationEvent();
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted + iAsBinder2);
        }
        return asinterface;
    }

    private static void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3, int i4, access000 access000Var, @Nullable String str, asInterface asinterface) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i3 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListOf = null;
        long j = Long.MAX_VALUE;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i5 = i4 - 16;
                byte[] bArr = new byte[i5];
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i5);
                immutableListOf = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i2 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i2 == 1937010800) {
                j = 0;
            } else if (i2 == 1664495672) {
                asinterface.onNavigationEvent = 1;
                str2 = "application/x-mp4-cea-608";
            } else if (i2 == 1836070003) {
                int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1702061171) {
                    onWarmupCompleted onWarmupCompleted2 = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted);
                    if (onWarmupCompleted2.onWarmupCompleted == null || onWarmupCompleted2.onWarmupCompleted.length != 64) {
                        return;
                    }
                    immutableListOf = ImmutableList.of(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(onNavigationEvent(onWarmupCompleted2.onWarmupCompleted, access000Var.onTransact, access000Var.onWarmupCompleted)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            } else {
                throw new IllegalStateException();
            }
        }
        if (str2 != null) {
            asinterface.onWarmupCompleted = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallback_Parcel(access000Var.onNavigationEvent).IAuthTabCallbackDefault(str2).onWarmupCompleted(str).onExtraCallback(j).IAuthTabCallback(immutableListOf).onNavigationEvent();
        }
    }

    private static String onNavigationEvent(byte[] bArr, int i2, int i3) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i4 = 0; i4 < bArr.length - 3; i4 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(onExtraCallback(Ints.fromBytes(bArr[i4], bArr[i4 + 1], bArr[i4 + 2], bArr[i4 + 3])))));
        }
        return "size: " + i2 + "x" + i3 + "\npalette: " + Joiner.on(", ").join(arrayList) + "\n";
    }

    private static int onExtraCallback(int i2) {
        int i3 = (i2 >> 16) & OggPageHeader.MAX_SEGMENT_COUNT;
        int i4 = ((i2 >> 8) & OggPageHeader.MAX_SEGMENT_COUNT) - 128;
        int i5 = (i2 & OggPageHeader.MAX_SEGMENT_COUNT) - 128;
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(i3 + ((i5 * 17790) / 10000), 0, OggPageHeader.MAX_SEGMENT_COUNT) | (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(((i4 * 14075) / 10000) + i3, 0, OggPageHeader.MAX_SEGMENT_COUNT) << 16) | (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback((i3 - ((i5 * 3455) / 10000)) - ((i4 * 7169) / 10000), 0, OggPageHeader.MAX_SEGMENT_COUNT) << 8);
    }

    private static void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3, int i4, int i5, @Nullable String str, int i6, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, asInterface asinterface, int i7) throws ParserException {
        String str2;
        String str3;
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda02;
        int i8;
        int i9;
        int i10;
        TextFieldKeyEventHandlerExternalSyntheticLambda1.access000 access000Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = i3;
        int i22 = i4;
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult = basicTextContextMenuProviderExternalSyntheticLambda0;
        asInterface asinterface2 = asinterface;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i21 + 16);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(16);
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        int iOnUnminimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(50);
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        int iIntValue = i2;
        if (iIntValue == 1701733238) {
            Pair<Integer, ProgressIndicatorKtExternalSyntheticLambda11> pairOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i21, i22);
            if (pairOnNavigationEvent != null) {
                iIntValue = ((Integer) pairOnNavigationEvent.first).intValue();
                basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult = basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult == null ? null : basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallbackWithResult(((ProgressIndicatorKtExternalSyntheticLambda11) pairOnNavigationEvent.second).IAuthTabCallback);
                asinterface2.onExtraCallbackWithResult[i7] = (ProgressIndicatorKtExternalSyntheticLambda11) pairOnNavigationEvent.second;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
        }
        String str4 = "video/3gpp";
        if (iIntValue != 1831958048) {
            str2 = iIntValue == 1211250227 ? "video/3gpp" : null;
        } else {
            str2 = "video/mpeg";
        }
        int i23 = 8;
        float fOnExtraCallback = 1.0f;
        List<byte[]> listBuild = null;
        int i24 = -1;
        byte[] bArrOnWarmupCompleted = null;
        String str5 = null;
        int iIAuthTabCallback = -1;
        int i25 = -1;
        int iOnNavigationEvent = -1;
        ByteBuffer byteBufferOnExtraCallbackWithResult = null;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = null;
        onWarmupCompleted onWarmupCompleted2 = null;
        TextFieldKeyEventHandlerExternalSyntheticLambda1.access000 access000Var2 = null;
        boolean z = false;
        int i30 = 8;
        while (iOnWarmupCompleted - i21 < i22) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            int iOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (iAsBinder == 0) {
                str3 = str4;
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() - i21 == i22) {
                    break;
                }
            } else {
                str3 = str4;
            }
            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(iAsBinder > 0, "childAtomSize must be positive");
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (iAsBinder2 == 1635148611) {
                DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(str2 == null, null);
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                DrawerKtExternalSyntheticLambda30 drawerKtExternalSyntheticLambda30OnNavigationEvent = DrawerKtExternalSyntheticLambda30.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                listBuild = drawerKtExternalSyntheticLambda30OnNavigationEvent.IAuthTabCallbackDefault;
                asinterface2.IAuthTabCallback = drawerKtExternalSyntheticLambda30OnNavigationEvent.IAuthTabCallbackStub;
                if (!z) {
                    fOnExtraCallback = drawerKtExternalSyntheticLambda30OnNavigationEvent.access000;
                }
                String str6 = drawerKtExternalSyntheticLambda30OnNavigationEvent.onExtraCallback;
                int i31 = drawerKtExternalSyntheticLambda30OnNavigationEvent.asBinder;
                int i32 = drawerKtExternalSyntheticLambda30OnNavigationEvent.IAuthTabCallback;
                int i33 = drawerKtExternalSyntheticLambda30OnNavigationEvent.onNavigationEvent;
                int i34 = drawerKtExternalSyntheticLambda30OnNavigationEvent.onTransact;
                int i35 = drawerKtExternalSyntheticLambda30OnNavigationEvent.onWarmupCompleted;
                basicTextContextMenuProviderExternalSyntheticLambda02 = basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult;
                i12 = iOnUnminimized;
                i13 = iOnUnminimized2;
                i14 = iIntValue;
                i29 = i31;
                iOnNavigationEvent = i32;
                i9 = i33;
                iIAuthTabCallback = i34;
                i30 = drawerKtExternalSyntheticLambda30OnNavigationEvent.onExtraCallbackWithResult;
                i23 = i35;
                str5 = str6;
                str2 = "video/avc";
            } else if (iAsBinder2 == 1752589123) {
                DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(str2 == null, null);
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                ExposedDropdownMenuBoxScopeExternalSyntheticLambda2 exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted = ExposedDropdownMenuBoxScopeExternalSyntheticLambda2.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                listBuild = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.IAuthTabCallbackStub;
                asinterface2.IAuthTabCallback = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.IAuthTabCallback_Parcel;
                if (!z) {
                    fOnExtraCallback = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.access000;
                }
                int i36 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.getInterfaceDescriptor;
                int i37 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.access100;
                String str7 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.onNavigationEvent;
                int i38 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.IAuthTabCallbackStubProxy;
                if (i38 != -1) {
                    i24 = i38;
                }
                int i39 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.onTransact;
                int i40 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.asBinder;
                int i41 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.onWarmupCompleted;
                int i42 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.IAuthTabCallback;
                int i43 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.asInterface;
                int i44 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.onExtraCallbackWithResult;
                int i45 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.onExtraCallback;
                access000Var2 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.extraCallbackWithResult;
                basicTextContextMenuProviderExternalSyntheticLambda02 = basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult;
                i12 = iOnUnminimized;
                i13 = iOnUnminimized2;
                i28 = i37;
                str2 = "video/hevc";
                i27 = i39;
                i29 = i36;
                i9 = i42;
                i14 = iIntValue;
                str5 = str7;
                i23 = i44;
                i26 = i40;
                i30 = i45;
                iOnNavigationEvent = i41;
                iIAuthTabCallback = i43;
            } else {
                basicTextContextMenuProviderExternalSyntheticLambda02 = basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult;
                if (iAsBinder2 == 1818785347) {
                    DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent("video/hevc".equals(str2), "lhvC must follow hvcC atom");
                    access000Var = access000Var2;
                    DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(access000Var != null && access000Var.onNavigationEvent.size() >= 2, "must have at least two layers");
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                    ExposedDropdownMenuBoxScopeExternalSyntheticLambda2 exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnExtraCallback = ExposedDropdownMenuBoxScopeExternalSyntheticLambda2.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, (TextFieldKeyEventHandlerExternalSyntheticLambda1.access000) RecordingInputConnection_androidKt.onExtraCallbackWithResult(access000Var));
                    DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(asinterface2.IAuthTabCallback == exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnExtraCallback.IAuthTabCallback_Parcel, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                    int i46 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnExtraCallback.onWarmupCompleted;
                    i10 = iOnNavigationEvent;
                    if (i46 != -1) {
                        DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(i10 == i46, "colorSpace must be the same for both views");
                    }
                    int i47 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnExtraCallback.IAuthTabCallback;
                    int i48 = i25;
                    if (i47 != -1) {
                        DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(i48 == i47, "colorRange must be the same for both views");
                    }
                    int i49 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnExtraCallback.asInterface;
                    if (i49 != -1) {
                        int i50 = iIAuthTabCallback;
                        i20 = i50;
                        DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(i50 == i49, "colorTransfer must be the same for both views");
                    } else {
                        i20 = iIAuthTabCallback;
                    }
                    DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(i23 == exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnExtraCallback.onExtraCallbackWithResult, "bitdepthLuma must be the same for both views");
                    DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(i30 == exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnExtraCallback.onExtraCallback, "bitdepthChroma must be the same for both views");
                    if (listBuild != null) {
                        listBuild = ImmutableList.builder().addAll(listBuild).addAll(exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnExtraCallback.IAuthTabCallbackStub).build();
                    } else {
                        DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(false, "initializationData must be already set from hvcC atom");
                    }
                    str2 = "video/mv-hevc";
                    i9 = i48;
                    i8 = i20;
                    str5 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnExtraCallback.onNavigationEvent;
                } else {
                    i8 = iIAuthTabCallback;
                    i9 = i25;
                    i10 = iOnNavigationEvent;
                    access000Var = access000Var2;
                    if (iAsBinder2 == 1986361461) {
                        IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted2, iAsBinder);
                        if (iAuthTabCallback_ParcelIAuthTabCallback == null || iAuthTabCallback_ParcelIAuthTabCallback.onNavigationEvent == null) {
                            i19 = i24;
                            i24 = i19;
                        } else if (access000Var == null || access000Var.onNavigationEvent.size() < 2) {
                            i19 = i24;
                            if (i19 == -1) {
                                i24 = iAuthTabCallback_ParcelIAuthTabCallback.onNavigationEvent.onExtraCallback.onWarmupCompleted ? 5 : 4;
                            } else {
                                i24 = i19;
                            }
                        } else {
                            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallback.IAuthTabCallback(), "both eye views must be marked as available");
                            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(!iAuthTabCallback_ParcelIAuthTabCallback.onNavigationEvent.onExtraCallback.onWarmupCompleted, "for MV-HEVC, eye_views_reversed must be set to false");
                            i19 = i24;
                            i24 = i19;
                        }
                    } else {
                        int i51 = i24;
                        if (iAsBinder2 == 1685480259 || iAsBinder2 == 1685485123 || iAsBinder2 == 1685485379) {
                            i11 = i51;
                            i12 = iOnUnminimized;
                            i13 = iOnUnminimized2;
                            i14 = iIntValue;
                            i15 = i23;
                            i16 = i30;
                            i17 = i8;
                            int i52 = iAsBinder - 8;
                            byte[] bArr = new byte[i52];
                            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, i52);
                            if (listBuild != null) {
                                listBuild = ImmutableList.builder().addAll(listBuild).add(bArr).build();
                            } else {
                                DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(false, "initializationData must already be set from hvcC or avcC atom");
                            }
                            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda7 textFieldDecoratorModifierNodeExternalSyntheticLambda7OnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda7.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                            if (textFieldDecoratorModifierNodeExternalSyntheticLambda7OnWarmupCompleted != null) {
                                str2 = "video/dolby-vision";
                                str5 = textFieldDecoratorModifierNodeExternalSyntheticLambda7OnWarmupCompleted.onExtraCallback;
                            }
                        } else {
                            if (iAsBinder2 == 1987076931) {
                                DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(str2 == null, null);
                                String str8 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 12);
                                byte bOnMinimized = (byte) textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                byte bOnMinimized2 = (byte) textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                int i53 = iOnMinimized >> 4;
                                byte b = (byte) ((iOnMinimized >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    listBuild = TextFieldCoreModifierNodeExternalSyntheticLambda1.onWarmupCompleted(bOnMinimized, bOnMinimized2, (byte) i53, b);
                                }
                                boolean z2 = (iOnMinimized & 1) != 0;
                                int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                iOnNavigationEvent = TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent(iOnMinimized2);
                                i18 = z2 ? 1 : 2;
                                iIAuthTabCallback = TextToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback(iOnMinimized3);
                                str2 = str8;
                                i12 = iOnUnminimized;
                                i13 = iOnUnminimized2;
                                i23 = i53;
                                i30 = i23;
                            } else {
                                if (iAsBinder2 == 1635135811) {
                                    int i54 = iAsBinder - 8;
                                    byte[] bArr2 = new byte[i54];
                                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr2, 0, i54);
                                    listBuild = ImmutableList.of(bArr2);
                                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                                    TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
                                    i23 = textToolbarHelperApi28ExternalSyntheticLambda1OnExtraCallbackWithResult.onTransact;
                                    i30 = textToolbarHelperApi28ExternalSyntheticLambda1OnExtraCallbackWithResult.onExtraCallbackWithResult;
                                    int i55 = textToolbarHelperApi28ExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallback;
                                    int i56 = textToolbarHelperApi28ExternalSyntheticLambda1OnExtraCallbackWithResult.onWarmupCompleted;
                                    iIAuthTabCallback = textToolbarHelperApi28ExternalSyntheticLambda1OnExtraCallbackWithResult.IAuthTabCallbackStub;
                                    iOnNavigationEvent = i55;
                                    i18 = i56;
                                    str2 = "video/av01";
                                } else if (iAsBinder2 == 1668050025) {
                                    if (byteBufferOnExtraCallbackWithResult == null) {
                                        byteBufferOnExtraCallbackWithResult = onExtraCallbackWithResult();
                                    }
                                    ByteBuffer byteBuffer = byteBufferOnExtraCallbackWithResult;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback());
                                    byteBuffer.putShort(textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback());
                                    byteBufferOnExtraCallbackWithResult = byteBuffer;
                                    iOnNavigationEvent = i10;
                                    iIAuthTabCallback = i8;
                                    i18 = i9;
                                } else {
                                    if (iAsBinder2 == 1835295606) {
                                        if (byteBufferOnExtraCallbackWithResult == null) {
                                            byteBufferOnExtraCallbackWithResult = onExtraCallbackWithResult();
                                        }
                                        ByteBuffer byteBuffer2 = byteBufferOnExtraCallbackWithResult;
                                        short sICustomTabsCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
                                        short sICustomTabsCallback2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
                                        i14 = iIntValue;
                                        short sICustomTabsCallback3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
                                        short sICustomTabsCallback4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
                                        int i57 = i30;
                                        short sICustomTabsCallback5 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
                                        int i58 = i23;
                                        short sICustomTabsCallback6 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
                                        i11 = i51;
                                        short sICustomTabsCallback7 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
                                        i13 = iOnUnminimized2;
                                        short sICustomTabsCallback8 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback();
                                        long jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
                                        long jOnActivityResized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
                                        i12 = iOnUnminimized;
                                        byteBuffer2.position(1);
                                        byteBuffer2.putShort(sICustomTabsCallback5);
                                        byteBuffer2.putShort(sICustomTabsCallback6);
                                        byteBuffer2.putShort(sICustomTabsCallback);
                                        byteBuffer2.putShort(sICustomTabsCallback2);
                                        byteBuffer2.putShort(sICustomTabsCallback3);
                                        byteBuffer2.putShort(sICustomTabsCallback4);
                                        byteBuffer2.putShort(sICustomTabsCallback7);
                                        byteBuffer2.putShort(sICustomTabsCallback8);
                                        byteBuffer2.putShort((short) (jOnActivityResized / 10000));
                                        byteBuffer2.putShort((short) (jOnActivityResized2 / 10000));
                                        byteBufferOnExtraCallbackWithResult = byteBuffer2;
                                        i30 = i57;
                                        i23 = i58;
                                        iIAuthTabCallback = i8;
                                    } else {
                                        i11 = i51;
                                        i12 = iOnUnminimized;
                                        i13 = iOnUnminimized2;
                                        i14 = iIntValue;
                                        i15 = i23;
                                        i16 = i30;
                                        if (iAsBinder2 == 1681012275) {
                                            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(str2 == null, null);
                                            str2 = str3;
                                        } else if (iAsBinder2 == 1702061171) {
                                            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(str2 == null, null);
                                            onWarmupCompleted2 = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted2);
                                            str2 = onWarmupCompleted2.IAuthTabCallback;
                                            byte[] bArr3 = onWarmupCompleted2.onWarmupCompleted;
                                            if (bArr3 != null) {
                                                listBuild = ImmutableList.of(bArr3);
                                            }
                                        } else if (iAsBinder2 == 1651798644) {
                                            onextracallbackwithresultIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted2);
                                        } else if (iAsBinder2 == 1885434736) {
                                            fOnExtraCallback = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted2);
                                            i30 = i16;
                                            i23 = i15;
                                            iIAuthTabCallback = i8;
                                            z = true;
                                        } else if (iAsBinder2 == 1937126244) {
                                            bArrOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted2, iAsBinder);
                                        } else if (iAsBinder2 == 1936995172) {
                                            int iOnMinimized4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(3);
                                            if (iOnMinimized4 == 0) {
                                                int iOnMinimized5 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                                if (iOnMinimized5 == 0) {
                                                    i11 = 0;
                                                } else if (iOnMinimized5 == 1) {
                                                    i11 = 1;
                                                } else if (iOnMinimized5 == 2) {
                                                    i11 = 2;
                                                } else if (iOnMinimized5 == 3) {
                                                    i11 = 3;
                                                }
                                            }
                                        } else if (iAsBinder2 == 1634760259) {
                                            int i59 = iAsBinder - 12;
                                            byte[] bArr4 = new byte[i59];
                                            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 12);
                                            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr4, 0, i59);
                                            List<byte[]> listOf = ImmutableList.of(bArr4);
                                            TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr4));
                                            i23 = textToolbarHelperApi28ExternalSyntheticLambda1IAuthTabCallback.onTransact;
                                            i30 = textToolbarHelperApi28ExternalSyntheticLambda1IAuthTabCallback.onExtraCallbackWithResult;
                                            int i60 = textToolbarHelperApi28ExternalSyntheticLambda1IAuthTabCallback.IAuthTabCallback;
                                            int i61 = textToolbarHelperApi28ExternalSyntheticLambda1IAuthTabCallback.onWarmupCompleted;
                                            str2 = "video/apv";
                                            listBuild = listOf;
                                            iIAuthTabCallback = textToolbarHelperApi28ExternalSyntheticLambda1IAuthTabCallback.IAuthTabCallbackStub;
                                            iOnNavigationEvent = i60;
                                            i9 = i61;
                                            access000Var2 = access000Var;
                                            i24 = i11;
                                        } else if (iAsBinder2 == 1668246642) {
                                            i17 = i8;
                                            if (i10 == -1 && i17 == -1) {
                                                int iAsBinder3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
                                                if (iAsBinder3 == 1852009592 || iAsBinder3 == 1852009571) {
                                                    int iOnUnminimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                                                    int iOnUnminimized4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                                                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
                                                    boolean z3 = iAsBinder == 19 && (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 128) != 0;
                                                    int iOnNavigationEvent2 = TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent(iOnUnminimized3);
                                                    int i62 = z3 ? 1 : 2;
                                                    iIAuthTabCallback = TextToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback(iOnUnminimized4);
                                                    i9 = i62;
                                                    i30 = i16;
                                                    i23 = i15;
                                                    iOnNavigationEvent = iOnNavigationEvent2;
                                                    access000Var2 = access000Var;
                                                    i24 = i11;
                                                } else {
                                                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("BoxParsers", "Unsupported color type: " + TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback(iAsBinder3));
                                                }
                                            }
                                        } else {
                                            i17 = i8;
                                        }
                                        i30 = i16;
                                        i23 = i15;
                                        iIAuthTabCallback = i8;
                                        iOnNavigationEvent = i10;
                                        access000Var2 = access000Var;
                                        i24 = i11;
                                    }
                                    iOnNavigationEvent = i10;
                                    access000Var2 = access000Var;
                                    i24 = i11;
                                }
                                i12 = iOnUnminimized;
                                i13 = iOnUnminimized2;
                            }
                            access000Var2 = access000Var;
                            i9 = i18;
                            i24 = i51;
                            i14 = iIntValue;
                        }
                        iIAuthTabCallback = i17;
                        i30 = i16;
                        i23 = i15;
                        iOnNavigationEvent = i10;
                        access000Var2 = access000Var;
                        i24 = i11;
                    }
                }
                access000Var2 = access000Var;
                i12 = iOnUnminimized;
                i13 = iOnUnminimized2;
                i14 = iIntValue;
                iOnNavigationEvent = i10;
                iIAuthTabCallback = i8;
            }
            iOnWarmupCompleted += iAsBinder;
            i21 = i3;
            i22 = i4;
            asinterface2 = asinterface;
            str4 = str3;
            iIntValue = i14;
            basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult = basicTextContextMenuProviderExternalSyntheticLambda02;
            i25 = i9;
            iOnUnminimized2 = i13;
            iOnUnminimized = i12;
        }
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda03 = basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult;
        int i63 = iOnUnminimized;
        int i64 = iOnUnminimized2;
        int i65 = i23;
        int i66 = i24;
        int i67 = iIAuthTabCallback;
        int i68 = i25;
        int i69 = iOnNavigationEvent;
        int i70 = i30;
        if (str2 == null) {
            return;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallback_Parcel(i5).IAuthTabCallbackDefault(str2).onExtraCallback(str5).onActivityLayout(i63).access100(i64).asInterface(i27).IAuthTabCallbackDefault(i26).onNavigationEvent(fOnExtraCallback).ICustomTabsCallback(i6).onExtraCallbackWithResult(bArrOnWarmupCompleted).onMessageChannelReady(i66).IAuthTabCallback(listBuild).access000(i29).getInterfaceDescriptor(i28).onNavigationEvent(basicTextContextMenuProviderExternalSyntheticLambda03).onWarmupCompleted(str).onExtraCallback(new TextToolbarHelperApi28ExternalSyntheticLambda1.onExtraCallbackWithResult().onExtraCallback(i69).onNavigationEvent(i68).onExtraCallbackWithResult(i67).onWarmupCompleted(byteBufferOnExtraCallbackWithResult != null ? byteBufferOnExtraCallbackWithResult.array() : null).IAuthTabCallback(i65).onWarmupCompleted(i70).IAuthTabCallback());
        if (onextracallbackwithresultIAuthTabCallback != null) {
            onextracallbackwithresultOnExtraCallback.onNavigationEvent(Ints.saturatedCast(onextracallbackwithresultIAuthTabCallback.onNavigationEvent)).extraCallback(Ints.saturatedCast(onextracallbackwithresultIAuthTabCallback.IAuthTabCallback));
        } else if (onWarmupCompleted2 != null) {
            onextracallbackwithresultOnExtraCallback.onNavigationEvent(Ints.saturatedCast(onWarmupCompleted2.onNavigationEvent)).extraCallback(Ints.saturatedCast(onWarmupCompleted2.onExtraCallback));
        }
        asinterface.onWarmupCompleted = onextracallbackwithresultOnExtraCallback.onNavigationEvent();
    }

    private static TextToolbarHelperApi28ExternalSyntheticLambda1 onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        TextToolbarHelperApi28ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = new TextToolbarHelperApi28ExternalSyntheticLambda1.onExtraCallbackWithResult();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback());
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() << 3);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(1);
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        boolean zOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        if (iOnNavigationEvent == 2 && zOnWarmupCompleted) {
            onextracallbackwithresult.IAuthTabCallback(zOnWarmupCompleted2 ? 12 : 10);
            onextracallbackwithresult.onWarmupCompleted(zOnWarmupCompleted2 ? 12 : 10);
        } else if (iOnNavigationEvent <= 2) {
            onextracallbackwithresult.IAuthTabCallback(zOnWarmupCompleted ? 10 : 8);
            onextracallbackwithresult.onWarmupCompleted(zOnWarmupCompleted ? 10 : 8);
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(13);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
        if (iOnNavigationEvent2 != 1) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("BoxParsers", "Unsupported obu_type: " + iOnNavigationEvent2);
            return onextracallbackwithresult.IAuthTabCallback();
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("BoxParsers", "Unsupported obu_extension_flag");
            return onextracallbackwithresult.IAuthTabCallback();
        }
        boolean zOnWarmupCompleted3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        if (zOnWarmupCompleted3 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8) > 127) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("BoxParsers", "Excessive obu_size");
            return onextracallbackwithresult.IAuthTabCallback();
        }
        int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("BoxParsers", "Unsupported reduced_still_picture_header");
            return onextracallbackwithresult.IAuthTabCallback();
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("BoxParsers", "Unsupported timing_info_present_flag");
            return onextracallbackwithresult.IAuthTabCallback();
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onWarmupCompleted("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return onextracallbackwithresult.IAuthTabCallback();
        }
        int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
        boolean z = false;
        for (int i2 = 0; i2 <= iOnNavigationEvent4; i2++) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(12);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5) > 7) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
            }
        }
        int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
        int iOnNavigationEvent6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iOnNavigationEvent5 + 1);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iOnNavigationEvent6 + 1);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(7);
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(7);
        boolean zOnWarmupCompleted4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        if (zOnWarmupCompleted4) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
        }
        if ((textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted() || textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(1) > 0) && !textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(1);
        }
        if (zOnWarmupCompleted4) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
        boolean zOnWarmupCompleted5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        if (iOnNavigationEvent3 == 2 && zOnWarmupCompleted5) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        }
        if (iOnNavigationEvent3 != 1 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            z = true;
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            int iOnNavigationEvent7 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            int iOnNavigationEvent8 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            onextracallbackwithresult.onExtraCallback(TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent(iOnNavigationEvent7)).onNavigationEvent(((z || iOnNavigationEvent7 != 1 || iOnNavigationEvent8 != 13 || textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8) != 0) ? textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(1) : 1) != 1 ? 2 : 1).onExtraCallbackWithResult(TextToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback(iOnNavigationEvent8));
        }
        return onextracallbackwithresult.IAuthTabCallback();
    }

    private static TextToolbarHelperApi28ExternalSyntheticLambda1 IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        TextToolbarHelperApi28ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = new TextToolbarHelperApi28ExternalSyntheticLambda1.onExtraCallbackWithResult();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback());
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() << 3);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(1);
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
        for (int i2 = 0; i2 < iOnNavigationEvent; i2++) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(1);
            int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            for (int i3 = 0; i3 < iOnNavigationEvent2; i3++) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
                boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(11);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4) + 8;
                onextracallbackwithresult.IAuthTabCallback(iOnNavigationEvent3);
                onextracallbackwithresult.onWarmupCompleted(iOnNavigationEvent3);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(1);
                if (zOnWarmupCompleted) {
                    int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                    int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult(1);
                    onextracallbackwithresult.onExtraCallback(TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent(iOnNavigationEvent4)).onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted() ? 1 : 2).onExtraCallbackWithResult(TextToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback(iOnNavigationEvent5));
                }
            }
        }
        return onextracallbackwithresult.IAuthTabCallback();
    }

    private static ByteBuffer onExtraCallbackWithResult() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3, int i4, asInterface asinterface) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i3 + 16);
        if (i2 == 1835365492) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallbackWithResult();
            String strExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallbackWithResult();
            if (strExtraCallbackWithResult != null) {
                asinterface.onWarmupCompleted = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallback_Parcel(i4).IAuthTabCallbackDefault(strExtraCallbackWithResult).onNavigationEvent();
            }
        }
    }

    private static Pair<long[], long[]> onWarmupCompleted(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback) {
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onextracallback.onNavigationEvent(1701606260);
        if (onextracallbackwithresultOnNavigationEvent == null) {
            return null;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = onextracallbackwithresultOnNavigationEvent.onNavigationEvent;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        int iOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        long[] jArr = new long[iICustomTabsCallbackDefault];
        long[] jArr2 = new long[iICustomTabsCallbackDefault];
        for (int i2 = 0; i2 < iICustomTabsCallbackDefault; i2++) {
            jArr[i2] = iOnWarmupCompleted == 1 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackStubProxy() : textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
            jArr2[i2] = iOnWarmupCompleted == 1 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject() : textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallback() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static float onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2 + 8);
        return textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault() / textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3, int i4, int i5, @Nullable String str, boolean z, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, asInterface asinterface, int i6) throws ParserException {
        int iOnUnminimized;
        int iOnUnminimized2;
        int iOnActivityLayout;
        int iAsBinder;
        int i7;
        String str2;
        String str3;
        String str4;
        ImmutableList immutableListOf;
        int iOnWarmupCompleted;
        int i8;
        boolean z2;
        String str5;
        char c;
        String str6;
        int iIntValue = i2;
        int i9 = i3;
        int i10 = i4;
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult = basicTextContextMenuProviderExternalSyntheticLambda0;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i9 + 16);
        if (z) {
            iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(6);
        } else {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
            iOnUnminimized = 0;
        }
        if (iOnUnminimized == 0 || iOnUnminimized == 1) {
            iOnUnminimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(6);
            iOnActivityLayout = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityLayout();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() - 4);
            iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (iOnUnminimized == 1) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(16);
            }
            i7 = -1;
        } else {
            if (iOnUnminimized != 2) {
                return;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(16);
            iOnActivityLayout = (int) Math.round(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asInterface());
            int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
            int iICustomTabsCallbackDefault2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            int iICustomTabsCallbackDefault3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            boolean z3 = (iICustomTabsCallbackDefault3 & 1) != 0;
            boolean z4 = (iICustomTabsCallbackDefault3 & 2) != 0;
            if (!z3) {
                i7 = iICustomTabsCallbackDefault2 == 8 ? 3 : iICustomTabsCallbackDefault2 == 16 ? z4 ? 268435456 : 2 : iICustomTabsCallbackDefault2 == 24 ? z4 ? 1342177280 : 21 : iICustomTabsCallbackDefault2 == 32 ? z4 ? 1610612736 : 22 : -1;
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
                iOnUnminimized2 = iICustomTabsCallbackDefault;
                iAsBinder = 0;
            } else {
                if (iICustomTabsCallbackDefault2 == 32) {
                    i7 = 4;
                }
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
                iOnUnminimized2 = iICustomTabsCallbackDefault;
                iAsBinder = 0;
            }
        }
        if (iIntValue == 1767992678) {
            iOnActivityLayout = -1;
            iOnUnminimized2 = -1;
        } else {
            if (iIntValue != 1935764850) {
                iOnActivityLayout = iIntValue == 1935767394 ? 16000 : 8000;
            }
            iOnUnminimized2 = 1;
        }
        int iOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        if (iIntValue == 1701733217) {
            Pair<Integer, ProgressIndicatorKtExternalSyntheticLambda11> pairOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i9, i10);
            if (pairOnNavigationEvent != null) {
                iIntValue = ((Integer) pairOnNavigationEvent.first).intValue();
                basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult = basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult == null ? null : basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallbackWithResult(((ProgressIndicatorKtExternalSyntheticLambda11) pairOnNavigationEvent.second).IAuthTabCallback);
                asinterface.onExtraCallbackWithResult[i6] = (ProgressIndicatorKtExternalSyntheticLambda11) pairOnNavigationEvent.second;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2);
        }
        String str7 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue != 1936684916) {
            if (iIntValue == 1953984371) {
                str2 = "audio/raw";
                i7 = 268435456;
            } else if (iIntValue == 1819304813) {
                if (i7 == -1) {
                    i7 = 2;
                }
                str2 = "audio/raw";
            } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                str2 = "audio/mpeg";
            } else if (iIntValue == 1835557169) {
                str2 = "audio/mha1";
            } else if (iIntValue == 1835560241) {
                str2 = "audio/mhm1";
            } else if (iIntValue == 1634492771) {
                str2 = "audio/alac";
            } else if (iIntValue == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (iIntValue == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (iIntValue == 1332770163) {
                str2 = "audio/opus";
            } else if (iIntValue == 1716281667) {
                str2 = "audio/flac";
            } else if (iIntValue == 1835823201) {
                str2 = "audio/true-hd";
            } else {
                str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
            }
        }
        int i11 = i7;
        String str8 = null;
        ImmutableList immutableListOnNavigationEvent = null;
        onWarmupCompleted onWarmupCompleted2 = null;
        onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = null;
        while (iOnWarmupCompleted2 - i9 < i10) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2);
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(iAsBinder2 > 0, "childAtomSize must be positive");
            int iAsBinder3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (iAsBinder3 == 1835557187) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
                int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
                if (Objects.equals(str2, str7)) {
                    str6 = String.format("mhm1.%02X", Integer.valueOf(iOnMinimized));
                } else {
                    str6 = String.format("mha1.%02X", Integer.valueOf(iOnMinimized));
                }
                int iOnUnminimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                str8 = str6;
                byte[] bArr = new byte[iOnUnminimized3];
                str3 = str7;
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, iOnUnminimized3);
                if (immutableListOnNavigationEvent == null) {
                    immutableListOnNavigationEvent = ImmutableList.of(bArr);
                } else {
                    immutableListOnNavigationEvent = ImmutableList.of(bArr, immutableListOnNavigationEvent.get(0));
                }
            } else {
                str3 = str7;
                if (iAsBinder3 == 1835557200) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                    int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    if (iOnMinimized2 > 0) {
                        byte[] bArr2 = new byte[iOnMinimized2];
                        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr2, 0, iOnMinimized2);
                        if (immutableListOnNavigationEvent == null) {
                            immutableListOnNavigationEvent = ImmutableList.of(bArr2);
                        } else {
                            immutableListOnNavigationEvent = ImmutableList.of(immutableListOnNavigationEvent.get(0), bArr2);
                        }
                    }
                } else {
                    if (iAsBinder3 == 1702061171 || (z && iAsBinder3 == 2002876005)) {
                        int iIAuthTabCallback = iAsBinder3 == 1702061171 ? iOnWarmupCompleted2 : IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, 1702061171, iOnWarmupCompleted2, iAsBinder2);
                        if (iIAuthTabCallback != -1) {
                            onWarmupCompleted2 = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iIAuthTabCallback);
                            str2 = onWarmupCompleted2.IAuthTabCallback;
                            byte[] bArr3 = onWarmupCompleted2.onWarmupCompleted;
                            if (bArr3 != null) {
                                if ("audio/vorbis".equals(str2)) {
                                    immutableListOnNavigationEvent = ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onNavigationEvent(bArr3);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        DrawerKtExternalSyntheticLambda23.onWarmupCompleted onwarmupcompletedIAuthTabCallback = DrawerKtExternalSyntheticLambda23.IAuthTabCallback(bArr3);
                                        int i12 = onwarmupcompletedIAuthTabCallback.IAuthTabCallback;
                                        int i13 = onwarmupcompletedIAuthTabCallback.onExtraCallback;
                                        str4 = onwarmupcompletedIAuthTabCallback.onExtraCallbackWithResult;
                                        iOnActivityLayout = i12;
                                        iOnUnminimized2 = i13;
                                    } else {
                                        str4 = str8;
                                    }
                                    immutableListOf = ImmutableList.of(bArr3);
                                    iOnWarmupCompleted2 += iAsBinder2;
                                    i10 = i4;
                                    str7 = str3;
                                    str8 = str4;
                                    immutableListOnNavigationEvent = immutableListOf;
                                    i9 = i3;
                                }
                            }
                        }
                    } else if (iAsBinder3 == 1651798644) {
                        onextracallbackwithresultIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted2);
                    } else {
                        if (iAsBinder3 == 1684103987) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                            asinterface.onWarmupCompleted = DrawerKtExternalSyntheticLambda25.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, Integer.toString(i5), str, basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult);
                        } else if (iAsBinder3 == 1684366131) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                            asinterface.onWarmupCompleted = DrawerKtExternalSyntheticLambda25.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, Integer.toString(i5), str, basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult);
                        } else if (iAsBinder3 == 1684103988) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                            asinterface.onWarmupCompleted = DrawerKtExternalSyntheticLambda3.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, Integer.toString(i5), str, basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult);
                        } else {
                            if (iAsBinder3 == 1684892784) {
                                if (iAsBinder <= 0) {
                                    throw ParserException.onNavigationEvent("Invalid sample rate for Dolby TrueHD MLP stream: " + iAsBinder, (Throwable) null);
                                }
                                str5 = str8;
                                iOnActivityLayout = iAsBinder;
                                immutableListOf = immutableListOnNavigationEvent;
                                iOnUnminimized2 = 2;
                                z2 = false;
                            } else if (iAsBinder3 == 1684305011 || iAsBinder3 == 1969517683) {
                                asinterface.onWarmupCompleted = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallback_Parcel(i5).IAuthTabCallbackDefault(str2).onExtraCallback(iOnUnminimized2).extraCallbackWithResult(iOnActivityLayout).onNavigationEvent(basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult).onWarmupCompleted(str).onNavigationEvent();
                                immutableListOf = immutableListOnNavigationEvent;
                                str4 = str8;
                                iOnWarmupCompleted2 += iAsBinder2;
                                i10 = i4;
                                str7 = str3;
                                str8 = str4;
                                immutableListOnNavigationEvent = immutableListOf;
                                i9 = i3;
                            } else if (iAsBinder3 == 1682927731) {
                                int i14 = iAsBinder2 - 8;
                                byte[] bArr4 = onNavigationEvent;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i14);
                                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 8);
                                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArrCopyOf, bArr4.length, i14);
                                immutableListOnNavigationEvent = ExposedDropdownMenu_androidExternalSyntheticLambda0.onExtraCallbackWithResult(bArrCopyOf);
                            } else if (iAsBinder3 == 1684425825) {
                                byte[] bArr5 = new byte[iAsBinder2 - 8];
                                bArr5[0] = 102;
                                bArr5[1] = 76;
                                bArr5[2] = 97;
                                bArr5[3] = 67;
                                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 12);
                                c = 4;
                                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr5, 4, iAsBinder2 - 12);
                                immutableListOf = ImmutableList.of(bArr5);
                                str5 = str8;
                                z2 = false;
                            } else if (iAsBinder3 == 1634492771) {
                                int i15 = iAsBinder2 - 12;
                                byte[] bArr6 = new byte[i15];
                                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 12);
                                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr6, 0, i15);
                                Pair<Integer, Integer> pairOnNavigationEvent2 = TextFieldCoreModifierNodeExternalSyntheticLambda1.onNavigationEvent(bArr6);
                                int iIntValue2 = ((Integer) pairOnNavigationEvent2.first).intValue();
                                int iIntValue3 = ((Integer) pairOnNavigationEvent2.second).intValue();
                                immutableListOnNavigationEvent = ImmutableList.of(bArr6);
                                iOnActivityLayout = iIntValue2;
                                iOnUnminimized2 = iIntValue3;
                            } else if (iAsBinder3 == 1767990114) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 9);
                                int iOnRelationshipValidationResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onRelationshipValidationResult();
                                byte[] bArr7 = new byte[iOnRelationshipValidationResult];
                                z2 = false;
                                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr7, 0, iOnRelationshipValidationResult);
                                String strOnWarmupCompleted = TextFieldCoreModifierNodeExternalSyntheticLambda1.onWarmupCompleted(bArr7);
                                ImmutableList immutableListOf2 = ImmutableList.of(bArr7);
                                str5 = strOnWarmupCompleted;
                                immutableListOf = immutableListOf2;
                            } else if (iAsBinder3 == 1885564227) {
                                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2 + 12);
                                ByteOrder byteOrder = (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                                if (iIntValue == 1768973165) {
                                    iOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(iOnMinimized3, byteOrder);
                                    i8 = -1;
                                } else {
                                    iOnWarmupCompleted = (iIntValue == 1718641517 && iOnMinimized3 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i11;
                                    i8 = -1;
                                }
                                if (iOnWarmupCompleted != i8) {
                                    str2 = "audio/raw";
                                }
                                i11 = iOnWarmupCompleted;
                            } else {
                                immutableListOf = immutableListOnNavigationEvent;
                                str4 = str8;
                                iOnWarmupCompleted2 += iAsBinder2;
                                i10 = i4;
                                str7 = str3;
                                str8 = str4;
                                immutableListOnNavigationEvent = immutableListOf;
                                i9 = i3;
                            }
                            str4 = str5;
                            iOnWarmupCompleted2 += iAsBinder2;
                            i10 = i4;
                            str7 = str3;
                            str8 = str4;
                            immutableListOnNavigationEvent = immutableListOf;
                            i9 = i3;
                        }
                        immutableListOf = immutableListOnNavigationEvent;
                        str4 = str8;
                        iOnWarmupCompleted2 += iAsBinder2;
                        i10 = i4;
                        str7 = str3;
                        str8 = str4;
                        immutableListOnNavigationEvent = immutableListOf;
                        i9 = i3;
                    }
                    immutableListOf = immutableListOnNavigationEvent;
                    str4 = str8;
                    iOnWarmupCompleted2 += iAsBinder2;
                    i10 = i4;
                    str7 = str3;
                    str8 = str4;
                    immutableListOnNavigationEvent = immutableListOf;
                    i9 = i3;
                }
            }
            str5 = str8;
            immutableListOf = immutableListOnNavigationEvent;
            c = 4;
            z2 = false;
            str4 = str5;
            iOnWarmupCompleted2 += iAsBinder2;
            i10 = i4;
            str7 = str3;
            str8 = str4;
            immutableListOnNavigationEvent = immutableListOf;
            i9 = i3;
        }
        if (asinterface.onWarmupCompleted != null || str2 == null) {
            return;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallback_Parcel(i5).IAuthTabCallbackDefault(str2).onExtraCallback(str8).onExtraCallback(iOnUnminimized2).extraCallbackWithResult(iOnActivityLayout).writeTypedObject(i11).IAuthTabCallback(immutableListOnNavigationEvent).onNavigationEvent(basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallbackWithResult).onWarmupCompleted(str);
        if (onWarmupCompleted2 != null) {
            onextracallbackwithresultOnWarmupCompleted.onNavigationEvent(Ints.saturatedCast(onWarmupCompleted2.onNavigationEvent)).extraCallback(Ints.saturatedCast(onWarmupCompleted2.onExtraCallback));
        } else if (onextracallbackwithresultIAuthTabCallback != null) {
            onextracallbackwithresultOnWarmupCompleted.onNavigationEvent(Ints.saturatedCast(onextracallbackwithresultIAuthTabCallback.onNavigationEvent)).extraCallback(Ints.saturatedCast(onextracallbackwithresultIAuthTabCallback.IAuthTabCallback));
        }
        asinterface.onWarmupCompleted = onextracallbackwithresultOnWarmupCompleted.onNavigationEvent();
    }

    private static int IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3, int i4) throws ParserException {
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(iOnWarmupCompleted >= i3, null);
        while (iOnWarmupCompleted - i3 < i4) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(iAsBinder > 0, "childAtomSize must be positive");
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == i2) {
                return iOnWarmupCompleted;
            }
            iOnWarmupCompleted += iAsBinder;
        }
        return -1;
    }

    private static onWarmupCompleted onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2 + 12);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        if ((iOnMinimized & 128) != 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        }
        if ((iOnMinimized & 64) != 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized());
        }
        if ((iOnMinimized & 32) != 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        String strOnNavigationEvent = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized());
        if ("audio/mpeg".equals(strOnNavigationEvent) || "audio/vnd.dts".equals(strOnNavigationEvent) || "audio/vnd.dts.hd".equals(strOnNavigationEvent)) {
            return new onWarmupCompleted(strOnNavigationEvent, null, -1L, -1L);
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        long jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        long jOnActivityResized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        int iOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
        byte[] bArr = new byte[iOnWarmupCompleted];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, iOnWarmupCompleted);
        return new onWarmupCompleted(strOnNavigationEvent, bArr, jOnActivityResized2 <= 0 ? -1L : jOnActivityResized2, jOnActivityResized <= 0 ? -1L : jOnActivityResized);
    }

    private static onExtraCallbackWithResult IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2 + 8);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        return new onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized());
    }

    static IAuthTabCallback_Parcel IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) throws ParserException {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2 + 8);
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        onExtraCallback onextracallbackOnExtraCallbackWithResult = null;
        while (iOnWarmupCompleted - i2 < i3) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(iAsBinder > 0, "childAtomSize must be positive");
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1702454643) {
                onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted, iAsBinder);
            }
            iOnWarmupCompleted += iAsBinder;
        }
        if (onextracallbackOnExtraCallbackWithResult == null) {
            return null;
        }
        return new IAuthTabCallback_Parcel(onextracallbackOnExtraCallbackWithResult);
    }

    private static onExtraCallback onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) throws ParserException {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2 + 8);
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        while (iOnWarmupCompleted - i2 < i3) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(iAsBinder > 0, "childAtomSize must be positive");
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1937011305) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
                int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                return new onExtraCallback(new asBinder((iOnMinimized & 1) == 1, (iOnMinimized & 2) == 2, (iOnMinimized & 8) == 8));
            }
            iOnWarmupCompleted += iAsBinder;
        }
        return null;
    }

    private static Pair<Integer, ProgressIndicatorKtExternalSyntheticLambda11> onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) throws ParserException {
        Pair<Integer, ProgressIndicatorKtExternalSyntheticLambda11> pairOnExtraCallback;
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        while (iOnWarmupCompleted - i2 < i3) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(iAsBinder > 0, "childAtomSize must be positive");
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1936289382 && (pairOnExtraCallback = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iOnWarmupCompleted, iAsBinder)) != null) {
                return pairOnExtraCallback;
            }
            iOnWarmupCompleted += iAsBinder;
        }
        return null;
    }

    static Pair<Integer, ProgressIndicatorKtExternalSyntheticLambda11> onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) throws ParserException {
        int i4 = i2 + 8;
        int i5 = -1;
        int i6 = 0;
        String strOnWarmupCompleted = null;
        Integer numValueOf = null;
        while (i4 - i2 < i3) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i4);
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (iAsBinder2 == 1718775137) {
                numValueOf = Integer.valueOf(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
            } else if (iAsBinder2 == 1935894637) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
                strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(4);
            } else if (iAsBinder2 == 1935894633) {
                i5 = i4;
                i6 = iAsBinder;
            }
            i4 += iAsBinder;
        }
        if (!"cenc".equals(strOnWarmupCompleted) && !"cbc1".equals(strOnWarmupCompleted) && !"cens".equals(strOnWarmupCompleted) && !"cbcs".equals(strOnWarmupCompleted)) {
            return null;
        }
        DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(numValueOf != null, "frma atom is mandatory");
        DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(i5 != -1, "schi atom is mandatory");
        ProgressIndicatorKtExternalSyntheticLambda11 progressIndicatorKtExternalSyntheticLambda11OnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i5, i6, strOnWarmupCompleted);
        DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(progressIndicatorKtExternalSyntheticLambda11OnNavigationEvent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (ProgressIndicatorKtExternalSyntheticLambda11) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{progressIndicatorKtExternalSyntheticLambda11OnNavigationEvent}, -1084655742));
    }

    private static ProgressIndicatorKtExternalSyntheticLambda11 onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i6);
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1952804451) {
                int iOnWarmupCompleted = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
                if (iOnWarmupCompleted == 0) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
                    i4 = 0;
                    i5 = 0;
                } else {
                    int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    i4 = (iOnMinimized & 240) >> 4;
                    i5 = iOnMinimized & 15;
                }
                boolean z = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 1;
                int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                byte[] bArr2 = new byte[16];
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr2, 0, 16);
                if (z && iOnMinimized2 == 0) {
                    int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    bArr = new byte[iOnMinimized3];
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, iOnMinimized3);
                }
                return new ProgressIndicatorKtExternalSyntheticLambda11(z, str, iOnMinimized2, bArr2, i4, i5, bArr);
            }
            i6 += iAsBinder;
        }
    }

    private static byte[] onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i4);
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1886547818) {
                return Arrays.copyOfRange(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), i4, iAsBinder + i4);
            }
            i4 += iAsBinder;
        }
        return null;
    }

    private static int onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int i2 = iOnMinimized & 127;
        while ((iOnMinimized & 128) == 128) {
            iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            i2 = (i2 << 7) | (iOnMinimized & 127);
        }
        return i2;
    }

    private static boolean onExtraCallbackWithResult(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(4, 0, length)] && jArr[TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    static final class IAuthTabCallback {
        public long IAuthTabCallback;
        private final boolean IAuthTabCallbackDefault;
        private int IAuthTabCallbackStub;
        private int asInterface;
        public int onExtraCallback;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallbackWithResult;
        public final int onNavigationEvent;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onTransact;
        public int onWarmupCompleted;

        public IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202, boolean z) throws ParserException {
            this.onTransact = textFieldDecoratorModifierNodeExternalSyntheticLambda20;
            this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda202;
            this.IAuthTabCallbackDefault = z;
            textFieldDecoratorModifierNodeExternalSyntheticLambda202.asBinder(12);
            this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda202.ICustomTabsCallbackDefault();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(12);
            this.asInterface = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            DrawerKtScrimdismissDrawer11ExternalSyntheticLambda0.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() == 1, "first_chunk must be 1");
            this.onWarmupCompleted = -1;
        }

        public boolean onExtraCallbackWithResult() {
            long jOnActivityResized;
            int i2 = this.onWarmupCompleted + 1;
            this.onWarmupCompleted = i2;
            if (i2 == this.onNavigationEvent) {
                return false;
            }
            if (this.IAuthTabCallbackDefault) {
                jOnActivityResized = this.onExtraCallbackWithResult.ICustomTabsCallbackStubProxy();
            } else {
                jOnActivityResized = this.onExtraCallbackWithResult.onActivityResized();
            }
            this.IAuthTabCallback = jOnActivityResized;
            if (this.onWarmupCompleted == this.IAuthTabCallbackStub) {
                this.onExtraCallback = this.onTransact.ICustomTabsCallbackDefault();
                this.onTransact.IAuthTabCallbackDefault(4);
                int i3 = this.asInterface - 1;
                this.asInterface = i3;
                this.IAuthTabCallbackStub = i3 > 0 ? this.onTransact.ICustomTabsCallbackDefault() - 1 : -1;
            }
            return true;
        }
    }

    static final class access000 {
        private final long IAuthTabCallback;
        private final int onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final int onTransact;
        private final int onWarmupCompleted;

        public access000(int i2, long j, int i3, int i4, int i5, int i6) {
            this.onNavigationEvent = i2;
            this.IAuthTabCallback = j;
            this.onExtraCallbackWithResult = i3;
            this.onExtraCallback = i4;
            this.onTransact = i5;
            this.onWarmupCompleted = i6;
        }
    }

    static final class asInterface {
        public int IAuthTabCallback;
        public final ProgressIndicatorKtExternalSyntheticLambda11[] onExtraCallbackWithResult;
        public int onNavigationEvent = 0;
        public BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted;

        public asInterface(int i2) {
            this.onExtraCallbackWithResult = new ProgressIndicatorKtExternalSyntheticLambda11[i2];
        }
    }

    static final class onWarmupCompleted {
        private final String IAuthTabCallback;
        private final long onExtraCallback;
        private final long onNavigationEvent;
        private final byte[] onWarmupCompleted;

        public onWarmupCompleted(String str, byte[] bArr, long j, long j2) {
            this.IAuthTabCallback = str;
            this.onWarmupCompleted = bArr;
            this.onNavigationEvent = j;
            this.onExtraCallback = j2;
        }
    }

    static final class onExtraCallbackWithResult {
        private final long IAuthTabCallback;
        private final long onNavigationEvent;

        public onExtraCallbackWithResult(long j, long j2) {
            this.onNavigationEvent = j;
            this.IAuthTabCallback = j2;
        }
    }

    static final class asBinder {
        private final boolean IAuthTabCallback;
        private final boolean onExtraCallback;
        private final boolean onWarmupCompleted;

        public asBinder(boolean z, boolean z2, boolean z3) {
            this.onExtraCallback = z;
            this.IAuthTabCallback = z2;
            this.onWarmupCompleted = z3;
        }
    }

    static final class onExtraCallback {
        private final asBinder onExtraCallback;

        public onExtraCallback(asBinder asbinder) {
            this.onExtraCallback = asbinder;
        }
    }

    static final class onNavigationEvent {
        private final long IAuthTabCallback;
        private final String onExtraCallbackWithResult;
        private final long onNavigationEvent;

        public onNavigationEvent(long j, long j2, @Nullable String str) {
            this.onNavigationEvent = j;
            this.IAuthTabCallback = j2;
            this.onExtraCallbackWithResult = str;
        }
    }

    static final class IAuthTabCallback_Parcel {
        private final onExtraCallback onNavigationEvent;

        public IAuthTabCallback_Parcel(onExtraCallback onextracallback) {
            this.onNavigationEvent = onextracallback;
        }

        public boolean IAuthTabCallback() {
            onExtraCallback onextracallback = this.onNavigationEvent;
            return onextracallback != null && onextracallback.onExtraCallback.onExtraCallback && this.onNavigationEvent.onExtraCallback.IAuthTabCallback;
        }
    }

    static final class IAuthTabCallbackStub implements onTransact {
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback;
        private final int onExtraCallbackWithResult;
        private final int onNavigationEvent;

        public IAuthTabCallbackStub(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = onextracallbackwithresult.onNavigationEvent;
            this.IAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(12);
            int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            if ("audio/raw".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
                int iOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.onUnminimized, basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent);
                if (iICustomTabsCallbackDefault == 0 || iICustomTabsCallbackDefault % iOnNavigationEvent != 0) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iOnNavigationEvent + ", stsz sample size: " + iICustomTabsCallbackDefault);
                    iICustomTabsCallbackDefault = iOnNavigationEvent;
                }
            }
            this.onNavigationEvent = iICustomTabsCallbackDefault == 0 ? -1 : iICustomTabsCallbackDefault;
            this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        }

        @Override // o.OutlinedTextFieldKtExternalSyntheticLambda9.onTransact
        public int onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.OutlinedTextFieldKtExternalSyntheticLambda9.onTransact
        public int IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        @Override // o.OutlinedTextFieldKtExternalSyntheticLambda9.onTransact
        public int onExtraCallbackWithResult() {
            int i2 = this.onNavigationEvent;
            return i2 == -1 ? this.IAuthTabCallback.ICustomTabsCallbackDefault() : i2;
        }
    }

    static final class IAuthTabCallbackDefault implements onTransact {
        private final int IAuthTabCallback;
        private final int onExtraCallback;
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallbackWithResult;
        private int onNavigationEvent;
        private int onWarmupCompleted;

        @Override // o.OutlinedTextFieldKtExternalSyntheticLambda9.onTransact
        public int IAuthTabCallback() {
            return -1;
        }

        public IAuthTabCallbackDefault(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = onextracallbackwithresult.onNavigationEvent;
            this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(12);
            this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault() & OggPageHeader.MAX_SEGMENT_COUNT;
            this.IAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        }

        @Override // o.OutlinedTextFieldKtExternalSyntheticLambda9.onTransact
        public int onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        @Override // o.OutlinedTextFieldKtExternalSyntheticLambda9.onTransact
        public int onExtraCallbackWithResult() {
            int i2 = this.onExtraCallback;
            if (i2 == 8) {
                return this.onExtraCallbackWithResult.onMinimized();
            }
            if (i2 == 16) {
                return this.onExtraCallbackWithResult.onUnminimized();
            }
            int i3 = this.onNavigationEvent;
            this.onNavigationEvent = i3 + 1;
            if (i3 % 2 == 0) {
                int iOnMinimized = this.onExtraCallbackWithResult.onMinimized();
                this.onWarmupCompleted = iOnMinimized;
                return (iOnMinimized & 240) >> 4;
            }
            return this.onWarmupCompleted & 15;
        }
    }
}
