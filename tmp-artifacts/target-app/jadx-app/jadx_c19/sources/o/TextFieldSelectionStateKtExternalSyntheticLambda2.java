package o;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class TextFieldSelectionStateKtExternalSyntheticLambda2 extends TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 {
    private static final Pattern IAuthTabCallbackStub = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern onTransact = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern asInterface = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public static File onExtraCallbackWithResult(File file, int i2, long j, long j2) {
        return new File(file, i2 + "." + j + "." + j2 + ".v3.exo");
    }

    public static TextFieldSelectionStateKtExternalSyntheticLambda2 onNavigationEvent(String str, long j) {
        return new TextFieldSelectionStateKtExternalSyntheticLambda2(str, j, -1L, -9223372036854775807L, null);
    }

    public static TextFieldSelectionStateKtExternalSyntheticLambda2 onExtraCallbackWithResult(String str, long j, long j2) {
        return new TextFieldSelectionStateKtExternalSyntheticLambda2(str, j, j2, -9223372036854775807L, null);
    }

    public static TextFieldSelectionStateKtExternalSyntheticLambda2 IAuthTabCallback(File file, long j, TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1 textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1) {
        return IAuthTabCallback(file, j, -9223372036854775807L, textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1);
    }

    public static TextFieldSelectionStateKtExternalSyntheticLambda2 IAuthTabCallback(File file, long j, long j2, TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1 textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1) {
        File file2;
        String strIAuthTabCallback;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            File fileOnWarmupCompleted = onWarmupCompleted(file, textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1);
            if (fileOnWarmupCompleted == null) {
                return null;
            }
            file2 = fileOnWarmupCompleted;
            name = fileOnWarmupCompleted.getName();
        }
        Matcher matcher = asInterface.matcher(name);
        if (!matcher.matches() || (strIAuthTabCallback = textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.IAuthTabCallback(Integer.parseInt((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1))))) == null) {
            return null;
        }
        long length = j == -1 ? file2.length() : j;
        if (length == 0) {
            return null;
        }
        return new TextFieldSelectionStateKtExternalSyntheticLambda2(strIAuthTabCallback, Long.parseLong((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(2))), length, j2 == -9223372036854775807L ? Long.parseLong((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(3))) : j2, file2);
    }

    private static File onWarmupCompleted(File file, TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1 textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1) {
        String str;
        String name = file.getName();
        Matcher matcher = onTransact.matcher(name);
        if (matcher.matches()) {
            Object[] objArr = {(String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1))};
            str = (String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-1681877530, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, 1681877540);
        } else {
            matcher = IAuthTabCallbackStub.matcher(name);
            str = matcher.matches() ? (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(1)) : null;
        }
        if (str == null) {
            return null;
        }
        File fileOnExtraCallbackWithResult = onExtraCallbackWithResult((File) RecordingInputConnection_androidKt.onWarmupCompleted(file.getParentFile()), textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.onExtraCallbackWithResult(str), Long.parseLong((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(2))), Long.parseLong((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(3))));
        if (file.renameTo(fileOnExtraCallbackWithResult)) {
            return fileOnExtraCallbackWithResult;
        }
        return null;
    }

    private TextFieldSelectionStateKtExternalSyntheticLambda2(String str, long j, long j2, long j3, @Nullable File file) {
        super(str, j, j2, j3, file);
    }

    public TextFieldSelectionStateKtExternalSyntheticLambda2 onExtraCallback(File file, long j) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback);
        return new TextFieldSelectionStateKtExternalSyntheticLambda2(this.onWarmupCompleted, this.IAuthTabCallbackDefault, this.onExtraCallback, j, file);
    }
}
