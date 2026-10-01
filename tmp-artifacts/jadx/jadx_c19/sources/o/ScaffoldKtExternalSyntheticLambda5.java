package o;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ScaffoldKtExternalSyntheticLambda5 implements RippleKtExternalSyntheticLambda0 {
    private static final Pattern onWarmupCompleted = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern onNavigationEvent = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder onExtraCallback = new StringBuilder();
    private final ArrayList<String> IAuthTabCallback = new ArrayList<>();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallbackWithResult = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

    @Override // o.RippleKtExternalSyntheticLambda0
    public int onExtraCallback() {
        return 1;
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, int i2, int i3, RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) throws NumberFormatException {
        String str;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda102;
        String str2;
        String str3;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda103 = textFieldDecoratorModifierNodeExternalSyntheticLambda10;
        String str4 = "SubripParser";
        this.onExtraCallbackWithResult.onExtraCallback(bArr, i2 + i3);
        this.onExtraCallbackWithResult.asBinder(i2);
        Charset charsetOnWarmupCompleted = onWarmupCompleted(this.onExtraCallbackWithResult);
        ArrayList arrayList = (onnavigationevent.IAuthTabCallback == -9223372036854775807L || !onnavigationevent.onNavigationEvent) ? null : new ArrayList();
        while (true) {
            String strOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(charsetOnWarmupCompleted);
            if (strOnWarmupCompleted == null) {
                break;
            }
            if (strOnWarmupCompleted.isEmpty()) {
                str = str4;
                textFieldDecoratorModifierNodeExternalSyntheticLambda102 = textFieldDecoratorModifierNodeExternalSyntheticLambda103;
            } else {
                try {
                    Integer.parseInt(strOnWarmupCompleted);
                    String strOnWarmupCompleted2 = this.onExtraCallbackWithResult.onWarmupCompleted(charsetOnWarmupCompleted);
                    if (strOnWarmupCompleted2 == null) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult(str4, "Unexpected end");
                        break;
                    }
                    Matcher matcher = onWarmupCompleted.matcher(strOnWarmupCompleted2);
                    if (matcher.matches()) {
                        long jOnWarmupCompleted = onWarmupCompleted(matcher, 1);
                        long jOnWarmupCompleted2 = onWarmupCompleted(matcher, 6);
                        int i4 = 0;
                        this.onExtraCallback.setLength(0);
                        this.IAuthTabCallback.clear();
                        String strOnWarmupCompleted3 = this.onExtraCallbackWithResult.onWarmupCompleted(charsetOnWarmupCompleted);
                        while (!TextUtils.isEmpty(strOnWarmupCompleted3)) {
                            if (this.onExtraCallback.length() > 0) {
                                this.onExtraCallback.append("<br>");
                            }
                            this.onExtraCallback.append(IAuthTabCallback(strOnWarmupCompleted3, this.IAuthTabCallback));
                            strOnWarmupCompleted3 = this.onExtraCallbackWithResult.onWarmupCompleted(charsetOnWarmupCompleted);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.onExtraCallback.toString());
                        while (true) {
                            if (i4 >= this.IAuthTabCallback.size()) {
                                str2 = str4;
                                str3 = null;
                                break;
                            } else {
                                str3 = this.IAuthTabCallback.get(i4);
                                if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                    str2 = str4;
                                    break;
                                }
                                i4++;
                            }
                        }
                        long j = onnavigationevent.IAuthTabCallback;
                        if (j == -9223372036854775807L || jOnWarmupCompleted2 >= j) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda102 = textFieldDecoratorModifierNodeExternalSyntheticLambda10;
                            textFieldDecoratorModifierNodeExternalSyntheticLambda102.accept(new RadioButtonDefaults(ImmutableList.of(onExtraCallback(spannedFromHtml, str3)), jOnWarmupCompleted, jOnWarmupCompleted2 - jOnWarmupCompleted));
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new RadioButtonDefaults(ImmutableList.of(onExtraCallback(spannedFromHtml, str3)), jOnWarmupCompleted, jOnWarmupCompleted2 - jOnWarmupCompleted));
                            }
                            textFieldDecoratorModifierNodeExternalSyntheticLambda102 = textFieldDecoratorModifierNodeExternalSyntheticLambda10;
                        }
                        str = str2;
                    } else {
                        String str5 = str4;
                        textFieldDecoratorModifierNodeExternalSyntheticLambda102 = textFieldDecoratorModifierNodeExternalSyntheticLambda103;
                        str = str5;
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult(str, "Skipping invalid timing: " + strOnWarmupCompleted2);
                    }
                } catch (NumberFormatException unused) {
                    str = str4;
                    textFieldDecoratorModifierNodeExternalSyntheticLambda102 = textFieldDecoratorModifierNodeExternalSyntheticLambda103;
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult(str, "Skipping invalid index: " + strOnWarmupCompleted);
                }
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda103 = textFieldDecoratorModifierNodeExternalSyntheticLambda102;
            str4 = str;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda104 = textFieldDecoratorModifierNodeExternalSyntheticLambda103;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda104.accept((RadioButtonDefaults) it.next());
            }
        }
    }

    private Charset onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        Charset charsetExtraCommand = textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCommand();
        return charsetExtraCommand != null ? charsetExtraCommand : StandardCharsets.UTF_8;
    }

    private String IAuthTabCallback(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = onNavigationEvent.matcher(strTrim);
        int i2 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i2;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i2 += length;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ImeEditCommand_androidKtExternalSyntheticLambda1 onExtraCallback(Spanned spanned, @Nullable String str) {
        ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult().onNavigationEvent(spanned);
        if (str == null) {
            return onextracallbackwithresultOnNavigationEvent.IAuthTabCallback();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    onextracallbackwithresultOnNavigationEvent.onExtraCallback(0);
                    break;
                } else {
                    onextracallbackwithresultOnNavigationEvent.onExtraCallback(1);
                    break;
                }
            case -685620679:
                str.equals("{\\an2}");
                onextracallbackwithresultOnNavigationEvent.onExtraCallback(1);
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    onextracallbackwithresultOnNavigationEvent.onExtraCallback(2);
                    break;
                }
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                onextracallbackwithresultOnNavigationEvent.onExtraCallback(1);
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                }
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                onextracallbackwithresultOnNavigationEvent.onExtraCallback(1);
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                }
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(2);
                    break;
                } else {
                    onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(1);
                    break;
                }
            case -685620679:
                if (str.equals("{\\an2}")) {
                }
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(1);
                break;
            case -685620586:
                str.equals("{\\an5}");
                onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(1);
                break;
            case -685620555:
                str.equals("{\\an6}");
                onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(1);
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(0);
                    break;
                }
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                }
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                }
                break;
        }
        return onextracallbackwithresultOnNavigationEvent.onExtraCallbackWithResult(onWarmupCompleted(onextracallbackwithresultOnNavigationEvent.onWarmupCompleted())).onExtraCallback(onWarmupCompleted(onextracallbackwithresultOnNavigationEvent.onNavigationEvent()), 0).IAuthTabCallback();
    }

    private static long onWarmupCompleted(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2 + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(i2 + 2))) * RtspMessageUtil.DEFAULT_RTSP_TIMEOUT_MS) + (Long.parseLong((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(matcher.group(i2 + 3))) * 1000);
        String strGroup2 = matcher.group(i2 + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    public static float onWarmupCompleted(int i2) {
        if (i2 == 0) {
            return 0.08f;
        }
        if (i2 == 1) {
            return 0.5f;
        }
        if (i2 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }
}
